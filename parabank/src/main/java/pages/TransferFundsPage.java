package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferFundsPage {
	WebDriver driver;
	WebDriverWait wait;
	
	//Locators
	private final By TransferFundLink = By.partialLinkText("Accounts Overview");
	private final By TransferAmount = By.id("amount");
	private final By FromAccount = By.xpath("//*[@id=\"fromAccountId\"]/option");
	private final By ToAccount = By.xpath("//*[@id=\"toAccountId\"]/option");
	private final By TransferButton = By.xpath("//input[@value='Transfer']");
	private final By TransferMessage = By.xpath("//h1[normalize-space()='Transfer Complete!']");
	
	public TransferFundsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	private boolean checkTransferedSuccessfully() {
		return  driver.findElement(TransferMessage).isDisplayed();

	}
	
	public void transferFunds(int amount) {
		driver.findElement(TransferFundLink).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(TransferAmount));
		driver.findElement(TransferAmount).sendKeys(String.valueOf(amount));
		
		WebElement fromaccountElement = driver.findElement(FromAccount);

		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(FromAccount, 0));
		Select select = new Select(fromaccountElement);
		select.selectByIndex(0);
		
		WebElement toaccountElement = driver.findElement(ToAccount);
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(ToAccount, 0));
		Select select2 = new Select(toaccountElement);
		select2.selectByIndex(0);
		
		driver.findElement(TransferButton).click();
		checkTransferedSuccessfully();
	}
	

}

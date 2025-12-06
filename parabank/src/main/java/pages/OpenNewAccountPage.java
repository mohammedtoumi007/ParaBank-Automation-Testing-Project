package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenNewAccountPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//Locators
	private final By NewAccountLink = By.partialLinkText("Open New Account");
	private final By AccountType = By.id("type");
	private final By ExistAccount = By.id("fromAccountId");
	private final By ExistAccount_option1 = By.xpath("//*[@id=\"type\"]/option[1]");
	private final By OpenNewAccountButton = By.xpath("//*[@id=\"openAccountForm\"]/form/div/input");
	private final By OpenNewAccountMessage = By.xpath("//*[@id=\"openAccountResult\"]/p[1]");
	
	public OpenNewAccountPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	private boolean isAccountOpenedSuccessfully() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(OpenNewAccountMessage));
		return driver.findElement(OpenNewAccountMessage).isDisplayed();
	}
	
	public void openNewAccount(String typeName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(NewAccountLink));
		driver.findElement(NewAccountLink).click();
		
		WebElement accountTypeElement = driver.findElement(AccountType);
		Select select = new Select(accountTypeElement);
		select.selectByVisibleText(typeName);
		
		WebElement existAccountElement = driver.findElement(ExistAccount);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(ExistAccount_option1, 0));
		Select select2 = new Select(existAccountElement);
		select2.selectByIndex(0);
		
		driver.findElement(OpenNewAccountButton).click();
		isAccountOpenedSuccessfully();
	}
	
}

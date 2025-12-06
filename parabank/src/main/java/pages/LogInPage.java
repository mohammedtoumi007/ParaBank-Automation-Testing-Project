package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
	WebDriver driver;
	WebDriverWait wait;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Locators
	private final By Username = By.name("username");
	private final By Password = By.name("password");
	private final By LoginButton = By.xpath("//input[@value='Log In']");
	private final By AccountCreatedMassage = By.xpath("//h1[normalize-space()='Accounts Overview']");

	private boolean check_login_successfully() {
		return driver.findElement(AccountCreatedMassage).isDisplayed();
	}

	public void loginUser(String username, String password) {
		driver.findElement(Username).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(LoginButton).click();
		check_login_successfully();
	}

}

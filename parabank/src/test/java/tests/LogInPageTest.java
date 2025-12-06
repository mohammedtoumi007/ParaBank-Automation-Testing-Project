package tests;

import org.testng.annotations.Test;

import pages.LogInPage;
import utils.UserData;

public class LogInPageTest extends BaseTest {
	@Test(dataProvider = "csvData", dataProviderClass = UserData.class)
	public void loginTest(String firstName, String lastName, String address, String city, String state, String zipCode, String phone, String ssn, String username, String password) {
		new LogInPage(driver).loginUser(username, password);
	}

}

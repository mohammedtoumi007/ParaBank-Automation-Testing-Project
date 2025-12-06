package tests;

import org.testng.annotations.Test;

import pages.OpenNewAccountPage;

public class OpenNewAccountPageTest extends BaseTest{
	private final String typeName = "CHECKING";
	private final String existAccountName = "14898";
	
	@Test
	public void openAccountTest() {
		new OpenNewAccountPage(driver).openNewAccount(typeName);
	}

}

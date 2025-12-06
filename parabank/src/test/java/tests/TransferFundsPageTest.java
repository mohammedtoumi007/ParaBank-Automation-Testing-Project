package tests;

import org.testng.annotations.Test;

import pages.TransferFundsPage;

public class TransferFundsPageTest extends BaseTest {

	private final int amount = 100;

	@Test
	public void transferFundsPageTest() {
		new TransferFundsPage(driver).transferFunds(amount);
	}
}

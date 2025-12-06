package tests;

import org.testng.annotations.Test;
import pages.LogOutPage;

public class LogOutPageTest extends BaseTest {
	@Test
    public void logOutPageTest(){
        new LogOutPage(driver).Logout();
    }
}

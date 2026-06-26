package testCases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.FacebookLoginPage;
import utilities.ConfigReader;

public class FacebookLoginTest extends BaseTest {
	

	
	@Test
	public void loginTest() {
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		
		loginPage.enterUserName(ConfigReader.getProperty("username"));
		loginPage.enterPassword(ConfigReader.getProperty("password"));
		loginPage.clickLoginButton();
		
	}

}

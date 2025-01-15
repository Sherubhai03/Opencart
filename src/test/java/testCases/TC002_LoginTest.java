package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test(groups = {"Sanity","Master"})
	public void verify_login() {
		logger.info("Test started logintest");
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetpage =  macc.isMyAccountPageExists();
		//Assert.assertEquals(targetpage, true);
		Assert.assertTrue(targetpage);
		}
}

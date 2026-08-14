package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginTestDDT extends BaseClass{
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class, groups="DataDriven")
	public void verify_loginTestDDT(String email, String pwd, String exp) {
		
		logger.info("***** Starting TC003_LoginTestDDT *****");
		
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(pwd);
			lp.clickLogin();
			
			MyAccountPage ap = new MyAccountPage(driver);
			boolean targetPage = ap.isMyAccountPageExist();
			
			if(exp.equalsIgnoreCase("Valid")) {

			    if(targetPage) {
			        ap.clickLogout();
			        Assert.assertTrue(true);
			    }
			    else {
			        Assert.assertTrue(false);
			    }

			}
			else if(exp.equalsIgnoreCase("Invalid")) {

			    if(targetPage) {
			        ap.clickLogout();
			        Assert.assertTrue(false);
			    }
			    else {
			        Assert.assertTrue(true);
			    }

			}
			else {
			    Assert.fail("Invalid expected result value: " + exp);
			}
			
		}
		
		catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("***** Finished TC003_LoginTestDDT *****");

	}
}

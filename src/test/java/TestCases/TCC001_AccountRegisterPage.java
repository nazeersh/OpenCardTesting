package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectPage.AccountRegistationPage;
import pageObjectPage.HomePage;
import testBase.BaseClass;

public class TCC001_AccountRegisterPage extends BaseClass{
	@Test
	public void TestRegister() {
		try {
		logger.info("****Starting TCC001_AccountRegisterPage.......****");
		HomePage hp=new HomePage(driver);
		logger.info("ClickOnMyAccount....");
		hp.ClickOnMyAccount();
		logger.info("ClickOnRegister....");
		hp.ClickOnRegister();
		
		AccountRegistationPage regpage=new AccountRegistationPage(driver);
		logger.info("verify AccountRegistationPage....");
		String cnfTest=regpage.VerifyText();
		Assert.assertEquals(cnfTest, "Register Account");
		regpage.setFirstName("SHAIK");
		regpage.setLastName("Nazeer");
		regpage.setEmail("nazeerpashasn580086@gmail.com");
		regpage.setTelPhone("9347085868");
		regpage.setPassword("nazeerpasha123@");
		regpage.SetConfrmPassword("nazeerpasha123@");
		regpage.ClickOnPrivacy();
		regpage.ClickOnContinue();
		}catch (Exception e) {
			logger.error("Test Is Failed");
		}
		logger.info("*****FINISHED TCC001_AccountRegisterPage....");
		
	}
	
	

}

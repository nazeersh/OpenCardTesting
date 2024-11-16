package TestCases;

import org.testng.annotations.Test;

import pageObjectPage.HomePage;
import pageObjectPage.LoginPage;
import testBase.BaseClass;
import utilitesFile.Dataprovid;

public class TC002_LoginTest extends BaseClass {
	@Test(dataProvider = "dataprovid",dataProviderClass = Dataprovid.class)
	public void LoginTest(String email,String pass) {
		try {
		logger.info("****Starting TC002_LoginTest.....***");
		HomePage hp=new HomePage(driver);
		logger.info("ClickOnMyAccount.....");
		hp.ClickOnMyAccount();
		logger.info("ClickOnLogin......");
		hp.ClickOnLogin();
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Enter User Details.....");
		lp.setEmail(email);
		lp.SetPassword(pass);
		lp.ClickOnLogin();
		}catch (Exception e) {
			logger.error("Test is FAILD");
		}
		logger.info("****FINISHED TC002_LoginTest.....***");
	}

}

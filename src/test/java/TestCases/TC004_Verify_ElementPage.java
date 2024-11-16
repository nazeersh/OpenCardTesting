package TestCases;

import org.testng.annotations.Test;

import pageObjectPage.ElementPage;
import pageObjectPage.monitorPage;
import testBase.BaseClass;

public class TC004_Verify_ElementPage extends BaseClass{
	@Test
	public void Test_Element() {
		try {
		logger.info("*****Starting TC004_Verify_ElementPage....****");
		logger.info("ENTERD INTO THE ElementPage....");
		ElementPage Elpage=new ElementPage(driver);
		logger.info("MovieToElement.....");
		Elpage.MovieToElement();
		logger.info("ClickOnElement......");
		Elpage.ClickOnElement();
		
		logger.info("ENTERD INTO THE monitorPage....");
		monitorPage monpage=new monitorPage(driver);
		monpage.SelectOptionDarap();
		monpage.SelectShowDrapDown();
		//monpage.ClickOnLink();
		}catch (Exception e) {
			logger.error("Test Is FAILED");
		}
		logger.info("******FINISHED TC004_Verify_ElementPage.....");
		
	}

}

package TestCases;

import org.testng.annotations.Test;

import pageObjectPage.searchBox_page;
import testBase.BaseClass;

public class TC003_SearchBox_Testing  extends BaseClass{
	@Test
	public void Test_SearchBox() throws InterruptedException {
		logger.info("****Starting TC003_SearchBox_Testing.....");
		searchBox_page Spage=new searchBox_page(driver);
		logger.info("SetSearchBox....");
		Spage.SetSearchBox();
		Spage.SelectOption();
		Spage.SelectSubCategorys();
		Spage.SelectSubCategorydes();
		Spage.ClickOnSearch();
		
	}

}

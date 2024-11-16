package pageObjectPage;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.reactivex.rxjava3.functions.Action;

public class searchBox_page extends BasePage {

	public searchBox_page(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(name = "search")
	WebElement bttsearchBox;
	
	@FindBy(name="category_id")
	WebElement selectallcategory;
	
	@FindBy(xpath = "(//input[@value='1'])[1]")
	WebElement slcSubCatg;
	
	@FindBy(name = "description")
	WebElement slcsubdescrip;
	
	@FindBy(xpath = "//input[@value='Search']")
	WebElement clicksearch;
	
	public void SetSearchBox() throws InterruptedException {
		Actions actobj=new Actions(driver);
		actobj.sendKeys(bttsearchBox,"dell").perform();
		for(int i=0;i<=1;i++) {
			actobj.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
		}
		actobj.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}
	public void SelectOption() {
		Select slcobj=new Select(selectallcategory);
		List<WebElement>alloptions=slcobj.getOptions();
		for(WebElement alloption:alloptions) {
			System.out.println(alloption.getText());
		}
		slcobj.selectByIndex(1);
		slcobj.selectByValue("26");
		slcobj.selectByVisibleText("      Monitors");
		WebElement category=slcobj.getFirstSelectedOption();
		System.out.println(category.getText());
	}
	public void SelectSubCategorys() {
		slcSubCatg.click();
	}
	public void SelectSubCategorydes() {
		slcsubdescrip.click();
	}
	public void ClickOnSearch() {
		clicksearch.click();
	}

}

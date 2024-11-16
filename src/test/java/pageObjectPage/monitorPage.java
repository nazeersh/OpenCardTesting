package pageObjectPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class monitorPage extends BasePage{

	public monitorPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(id = "input-sort" )
	WebElement SelectOption;
	
	@FindBy(id = "input-limit")
	WebElement selectShow;
	
//	@FindBy(xpath = "//a[text()='Apple Cinema 30"']");
//	WebElement clickLink;
	
	public void SelectOptionDarap() {
		Select slcobj=new Select(SelectOption);
		List<WebElement>alloptions=slcobj.getOptions();
		for(WebElement alloption:alloptions) {
			System.out.println(alloption.getText());
		}
		slcobj.selectByIndex(1);
		slcobj.selectByValue("https://tutorialsninja.com/demo/index.php?route=product/category&path=25_28&sort=p.price&order=ASC&limit=25");
		slcobj.selectByVisibleText("Name (A - Z)");
	     WebElement input=slcobj.getFirstSelectedOption();
	     System.out.println(input.getText());
	}
	
	public void SelectShowDrapDown() {
		Select slcobj=new Select(selectShow);
		List<WebElement>selectalloptions=slcobj.getOptions();
		for(WebElement selectalloption:selectalloptions) {
			System.out.println(selectalloption.getText());
		}
		slcobj.selectByIndex(1);
		slcobj.selectByVisibleText("25");
//		WebElement show=slcobj1.getFirstSelectedOption();
//		System.out.println(show.getText());
	}
//	public void ClickOnLink() {
//		clickLink.click();
//	}

}

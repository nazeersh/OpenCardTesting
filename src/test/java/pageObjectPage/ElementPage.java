package pageObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ElementPage extends BasePage {

	public ElementPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "(//a[text()='Components'])[1]")
	WebElement clickComElm;
	
	@FindBy(xpath = "//a[text()='Monitors (2)']")
	WebElement clickMonitor;
	
	public void MovieToElement() {
		Actions actobj=new Actions(driver);
		actobj.moveToElement(clickComElm).perform();
	}
	public void ClickOnElement() {
		clickMonitor.click();
	}

}

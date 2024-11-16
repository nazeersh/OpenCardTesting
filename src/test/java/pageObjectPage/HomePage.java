package pageObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkclickonMyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement lknClickOnRegistation;
	

	@FindBy(xpath = "//a[text()='Login']")
	WebElement clickonLogin;

	

	public void ClickOnMyAccount() {
		lnkclickonMyAccount.click();
	}
	public void ClickOnRegister() {
		lknClickOnRegistation.click();
	}
	public void ClickOnLogin() {
		clickonLogin.click();
	}
	

}

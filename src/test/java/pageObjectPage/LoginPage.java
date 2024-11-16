package pageObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(name = "email")
	WebElement txtemail;
	
	@FindBy(name = "password")
	WebElement txtpassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement butclickOnLogin;
	
	public void setEmail(String email) {
		txtemail.sendKeys(email);
	}
	public void SetPassword(String pass) {
		txtpassword.sendKeys(pass);
	}
	public void ClickOnLogin() {
		butclickOnLogin.click();
	}

}

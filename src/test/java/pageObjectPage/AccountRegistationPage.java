package pageObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistationPage extends BasePage {

	public AccountRegistationPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//h1[text()='Register Account']")
	WebElement txtRegister;
	
	@FindBy(name="firstname")
	WebElement txtfname;
	
	@FindBy(name = "lastname")
	WebElement txtlastname;
	
	@FindBy(name = "email")
	WebElement txtemail;
	
	@FindBy(name = "telephone")
	WebElement txttelphone;
	
	@FindBy(name = "password")
	WebElement txtpassword;
	
	@FindBy(name = "confirm")
	WebElement txtconfpassword;
	
	@FindBy(name = "agree")
	WebElement Clickprivacy;
	
	@FindBy(name = "//input[@value='Continue']")
	WebElement clickonContinue;
	
	
	public String VerifyText() {
		try {
			return(txtRegister.getText());
		} catch (Exception e) {
			return(e.getMessage());
		}
	}
	public void setFirstName(String fname) {
		txtfname.sendKeys(fname);
	}
	public void setLastName(String lname) {
		txtlastname.sendKeys(lname);
	}
	public void setEmail(String email) {
		txtemail.sendKeys(email);
	}
	public void setTelPhone(String tphone) {
		txttelphone.sendKeys(tphone);
	}
	public void setPassword(String Pass) {
		txtpassword.sendKeys(Pass);
	}
	public void SetConfrmPassword(String cpass) {
		txtconfpassword.sendKeys(cpass);
	}
	public void ClickOnPrivacy() {
		Clickprivacy.click();
	}
	public void ClickOnContinue() {
		clickonContinue.click();
	}
	

}

package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends BasePage{

	public SigninPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="loginIdText")
	WebElement email;
	
	public void enterEmail(String Email) {
		enter_value(email,Email);
	}
	
	@FindBy(id="passwordText")
	WebElement password;
	
	public void enterPassword(String pass) {
		enter_value(password,pass);
	}
	
	@FindBy(id="loginValidate")
	WebElement signin;
	
	public void clickOnSignin() {
		clickAction(signin);
	}
	@FindBy(xpath="//div[@class='elementPad menuLabel secNavIcon']")
	WebElement account;
	public void buttonIsDisplay() {
		try {
			if(account.isDisplayed()) {
				System.out.println("**** User is successfully logged in ****");
			}
			}
			catch(Exception e) {
				System.out.println("**** User is not logged in ****");
			}
	}
	

}

package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgot_Password extends BasePage {

	public Forgot_Password(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//label[text()='Forgot Password? ']")
	WebElement Fpassword;
	
	public void clickOnForgotPassword() {
		clickAction(Fpassword);
	}
	
	@FindBy(css="input[placeholder='Email/Mobile']")
	WebElement mobile;
	
	public void enterMobileNumber(String mo) {
		enter_value(mobile,mo);
	}
	@FindBy(css="input[value='Send OTP']")
	WebElement sendOTP;
	
	public void clickOnSendOtp() {
		clickAction(sendOTP);
	}
	@FindBy(xpath="//input[@id='newPassword']")
	WebElement newPassword;
	
	public void enterNewPassword(String password) {
		enter_value(newPassword,password);
	}
	@FindBy(xpath="//input[@id='resetPassword']")
	WebElement resetPassword;
	
	public void clickOnResetPassword() {
		clickAction(resetPassword);
	}
	
	@FindBy(xpath="//div[@class='elementPad menuLabel secNavIcon']")
	WebElement account;
	
	public void buttonIsDisplay() {
		if(account.isDisplayed()) {
			System.out.println("**** Password for your via account has been successfully reset ****");
		}
		else {
			System.out.println("**** Enter valid Email/Mobile ****");
		}
	}

	
}

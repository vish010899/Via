package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage{
	
		public SignupPage(WebDriver driver) {
		super(driver);
	}
        
		@FindBy(xpath="//button[@id='wzrk-cancel']")
		WebElement PopUp;
		
		public void clickOkButton() {
			clickAction(PopUp);
		}
		
		@FindBy(xpath="//div[@id='SignIn']")
		WebElement signin;
		
		public void ClickSigninButton() {
			clickAction(signin);
		}
		
		@FindBy(xpath="//span[@class='signUpBtn']")
		WebElement signup;
		
		public void ClickOnSignup() {
			clickAction(signup);
		}
		
		@FindBy(id="emailIdSignUp")
		WebElement email;
		
		public void enterEmail(String mail) {
			enter_value(email,mail);
		}
		
		@FindBy(id="passwordSignUp")
		WebElement password;
		
		public void enterPassword(String pass) {
			enter_value(password,pass);
		}
		
		@FindBy(id="nameSignUp")
		WebElement Name;
		
		public void enterName(String name) {
			enter_value(Name,name);
		}
		
		@FindBy(id="mobileIsdSignUp")
         WebElement DD;
		
		public void selectDD() {
			clickAction(DD);
            Select select=new Select(DD);
			
			select.selectByVisibleText("91");
		}
		
		@FindBy(id="mobileNoSignUp")
		WebElement mobile;
		
		public void enterMobileNumber(String number) {
			enter_value(mobile,number);
		}
		@FindBy(xpath="//input[@id='signUpValidate']")
		WebElement createAccount;
		
		public void clickOnCreateAccount() {
			clickAction(createAccount);
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



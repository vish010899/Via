package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorporateLogin extends BasePage {

	public CorporateLogin(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[text()='Corporate Login']")
	WebElement corpo;
	
	public void clickOnCorporateLogin() {
		clickAction(corpo);
	}
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;
	
	public void loginButton() {
		try {
		if(login.isDisplayed()) {
			System.out.println("****User is able to login with corporate account****");
		}}
		catch(Exception e) {
			System.out.println("****User is not able to login with corporate account****");
		}
	}

}

package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgentLogin extends BasePage {

	public AgentLogin(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[text()='Agent Login']")
	WebElement agent;
	
	public void clickOnAgentLogin() {
		clickAction(agent);
	}
	
	@FindBy(xpath="//a[text()='Agency Sign in']")
	WebElement login;
	
	public void loginButton() {
		try {
		if(login.isDisplayed()) {
			System.out.println("****User is able to login with agent account****");
		}}
		catch(Exception e) {
			System.out.println("****User is not able to login with agent account****");
		}
	}

}

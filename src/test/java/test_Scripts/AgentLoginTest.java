package test_Scripts;

import java.util.Set;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.AgentLogin;
import pom_scripts.SignupPage;

public class AgentLoginTest  extends Base_Test{
	@Test
public void Via() throws InterruptedException{
		
        SignupPage sp = new SignupPage(driver);
		sp.clickOkButton();
		sp.ClickSigninButton();
		
		AgentLogin al=new AgentLogin(driver);
		al.clickOnAgentLogin();
		
		Set<String> windowHandles=driver.getWindowHandles();
		for(String handle:windowHandles) {
			driver.switchTo().window(handle);
			}
		al.loginButton();
}
}

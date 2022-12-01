package test_Scripts;

import java.util.Set;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.CorporateLogin;
import pom_scripts.SignupPage;

public class CorporateLoginTest  extends Base_Test{

	@Test
public void Via() throws InterruptedException{
		
        SignupPage sp = new SignupPage(driver);
		sp.clickOkButton();
		sp.ClickSigninButton();
		
		CorporateLogin cl=new CorporateLogin(driver);
		cl.clickOnCorporateLogin();
		
		Set<String> windowHandles=driver.getWindowHandles();
		for(String handle:windowHandles) {
			driver.switchTo().window(handle);
			}
		cl.loginButton();
	}
}


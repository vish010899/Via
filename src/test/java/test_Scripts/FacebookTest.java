package test_Scripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.FacebookLogin;
import pom_scripts.SignupPage;

public class FacebookTest extends Base_Test {

	@Test(dataProvider="testData")
	public void Via(String[]testData) throws InterruptedException{
		
        SignupPage sp = new SignupPage(driver);
		sp.clickOkButton();
		sp.ClickSigninButton();
		
		FacebookLogin FB=new FacebookLogin(driver);
		FB.clickOnFacebookLogin();
		Set<String> windowHandles=driver.getWindowHandles();
		for(String handle:windowHandles) {
			driver.switchTo().window(handle);}
		FB.enterEmail(testData[0]);
		FB.enterPassword(testData[1]);
		FB.clickOnCheckbox();
		FB.clickOnLogin();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.numberOfWindowsToBe(1));
		Set<String> windowHandles1=driver.getWindowHandles();
		for(String handle1:windowHandles1) {
			driver.switchTo().window(handle1);
		FB.buttonIsDisplay();
		}
	}
		@DataProvider(name="testData")
		public Object[][]getTestData() throws IOException{
			Object[][] testdata=ReadExcel.getMultipleData("Sheet5");
			return testdata;
		}
}

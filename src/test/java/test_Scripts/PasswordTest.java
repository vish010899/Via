package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Forgot_Password;
import pom_scripts.SignupPage;

public class PasswordTest extends Base_Test {
	
	@Test(dataProvider="testData")
	
	public void Via(String[]testData) throws InterruptedException{
			
	        SignupPage sp = new SignupPage(driver);
			sp.clickOkButton();
			sp.ClickSigninButton();
			
			Forgot_Password fp=new Forgot_Password(driver);
			
			fp.clickOnForgotPassword();
			fp.enterMobileNumber(testData[0]);
			fp.clickOnSendOtp();
			Thread.sleep(40000);
			fp.enterNewPassword(testData[1]);
			fp.clickOnResetPassword();
			fp.buttonIsDisplay();
	}
	       @DataProvider(name="testData")
	       public Object [][]getTestData() throws IOException{
		   Object [][] testdata=ReadExcel.getMultipleData("Sheet4");
		   return testdata;
}

}

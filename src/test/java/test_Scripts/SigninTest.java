package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.SigninPage;
import pom_scripts.SignupPage;

public class SigninTest extends Base_Test{

	@Test(dataProvider="testData")
	public void Via(String[]testData) throws InterruptedException{
		
        SignupPage sp = new SignupPage(driver);
		sp.clickOkButton();
		sp.ClickSigninButton();
		
		SigninPage SI=new SigninPage(driver);
		SI.enterEmail(testData[0]);
		SI.enterPassword(testData[1]);
		SI.clickOnSignin();
		SI.buttonIsDisplay();
	}
	@DataProvider(name="testData")
	public Object [][]getTestData() throws IOException{
		Object [][] testdata=ReadExcel.getMultipleData("Sheet3");
		return testdata;
}
}
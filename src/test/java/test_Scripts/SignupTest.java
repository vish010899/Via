package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.SignupPage;

public class SignupTest extends Base_Test {
	
		@Test(dataProvider="testData")
		public void Via(String[]testData) throws InterruptedException{
		SignupPage sp = new SignupPage(driver);
		
		sp.clickOkButton();
		sp.ClickSigninButton();
	    sp.ClickOnSignup();
	    sp.enterEmail(testData[0]);
	    sp.enterPassword(testData[1]);
	    sp.enterName(testData[2]);
	    sp.selectDD();
	    sp.enterMobileNumber(testData[3]);
	    sp.clickOnCreateAccount();
	    sp.buttonIsDisplay();
	    
		}
		@DataProvider(name="testData")
		public Object [][]getTestData() throws IOException{
			Object [][] testdata=ReadExcel.getMultipleData("Sheet2");
			return testdata;
	    
	    
		}
	}


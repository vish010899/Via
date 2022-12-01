package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogin extends BasePage{
	public FacebookLogin(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//button[text()='Login With Facebook']")
	WebElement FBbutton;
	
	public void clickOnFacebookLogin() {
		clickAction(FBbutton);
	}
	@FindBy(id="email")
	WebElement Email;
	
	public void enterEmail(String mail) {
//		Set<String> windowHandles=driver.getWindowHandles();
//		for(String handle:windowHandles) {
//			driver.switchTo().window(handle);
		
		enter_value(Email,mail);
	}

	@FindBy(id="pass")
	WebElement password;
	
	public void enterPassword(String pass) {
		enter_value(password,pass);
	}
	
	@FindBy(id="offline_access")
	WebElement checkbox;
	
	public void clickOnCheckbox() {
		clickAction(checkbox);
	}
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement login;
	
	public void clickOnLogin() {
		clickAction(login);
	}
	
	@FindBy(xpath="//div[@class='elementPad menuLabel secNavIcon']")
	WebElement account;
	
	public void buttonIsDisplay() {
		
//	try {
//			WebDriverWait wait=new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.numberOfWindowsToBe(1));
//	Set<String> windowHandles1=driver.getWindowHandles();
//	for(String handle1:windowHandles1) {
//		driver.switchTo().window(handle1);
//	}
	if(account.isDisplayed()) {
		System.out.println("**** User is successfully logged in ****");
	}
	else
		System.out.println("**** User is not logged in ****");
	}

//	catch(Exception e) {
//		System.out.println("**** User is  logged in ****");
//		
	}
	


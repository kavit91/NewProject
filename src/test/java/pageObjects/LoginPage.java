package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// to find the web element
	@FindBy (name="txtUsername")
	WebElement txtUsername;
	
	@FindBy (name="txtPassword")
	WebElement txtPassword;
	
	@FindBy (name="Submit")
	WebElement btnSubmit;
	
	// to initialize the web element (Action class)
	public void loginFun(String uname,String pwd)
	{
		txtUsername.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnSubmit.click();
	}
}

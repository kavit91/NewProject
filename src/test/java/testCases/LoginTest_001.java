package testCases;
import org.testng.annotations.Test;
import pageObjects.AddEmployee;
import pageObjects.LoginPage;
import pageObjects.SearchEmployee;

public class LoginTest_001 extends BaseClass {
	@Test
	public void login() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.loginFun("Admin", "admin123");
	}
}

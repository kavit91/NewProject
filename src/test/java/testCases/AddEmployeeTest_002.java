package testCases;
import org.testng.annotations.Test;

import pageObjects.AddEmployee;
import pageObjects.LoginPage;
public class AddEmployeeTest_002 extends BaseClass{
	
	@Test
	public void addEmployee() throws InterruptedException
	{
		
		// this will open login page
		LoginPage lp=new LoginPage(driver);
		lp.loginFun("Admin", "admin123");
		
		// this will create new Employee 
		AddEmployee ae=new AddEmployee(driver);
		ae.addEmployee("abc", "def", "pqr");
		Thread.sleep(3000);
	}
}

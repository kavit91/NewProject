package testCases;


import pageObjects.LoginPage;
import pageObjects.SearchEmployee;

public class SearchEmployeeTest_003 extends BaseClass{
	
	public void serachEmp() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.loginFun("Admin", "admin123");
		
		
		SearchEmployee semp=new SearchEmployee(driver);
		semp.searchEmployee("narendra");
		Thread.sleep(3000);

	}

}

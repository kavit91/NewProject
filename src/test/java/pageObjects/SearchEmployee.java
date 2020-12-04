package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchEmployee {
	
	public SearchEmployee(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//b[contains(text(),'PIM')]")
	WebElement clickPIM;
	
	@FindBy (xpath="//a[@id='menu_pim_viewEmployeeList']")
	WebElement viewEmployeeList;
	
	@FindBy (xpath="//input[@name=\"empsearch[employee_name][empName]\"]")
	WebElement employee_name;
	
	@FindBy (xpath="//input[@id='searchBtn']")
	WebElement btnSearch;
	
	public void searchEmployee(String empName) throws InterruptedException
	{
		clickPIM.click();
		viewEmployeeList.click();
		Thread.sleep(3000);
		employee_name.clear();
		employee_name.sendKeys(empName);
		btnSearch.click();
		Thread.sleep(3000);
		
	}
}

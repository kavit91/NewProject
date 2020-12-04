package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {

	public AddEmployee(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//b[contains(text(),'PIM')]")
	WebElement clickPIM;
	
	@FindBy (xpath="//a[@id='menu_pim_addEmployee']")
	WebElement addEmployee;
	
	@FindBy (name="firstName")
	WebElement firstName;
	
	@FindBy (name="middleName")
	WebElement middleName;
	
	@FindBy (name="lastName")
	WebElement lastName;
	
	@FindBy (xpath="//input[@id='btnSave']")
	WebElement btnSave;
	
	public void addEmployee(String fName,String mName, String lName)
	{
		clickPIM.click();
		addEmployee.click();
		firstName.sendKeys(fName);
		middleName.sendKeys(mName);
		lastName.sendKeys(lName);
		btnSave.click();
	}
}

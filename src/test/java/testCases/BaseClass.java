package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {

	WebDriver driver;
	@BeforeClass
	public void loginSetUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\mavenOrangeHRM\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}

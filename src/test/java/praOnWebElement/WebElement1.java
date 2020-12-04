package praOnWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\mavenOrangeHRM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://goo.gl/RVdKM9");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		String currentURL=driver.getCurrentUrl();
		String pageSource=driver.getPageSource();
		
		//firstName
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Arjun");
		//lastName
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys("Rampal");
		
		//phone
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-3']")).sendKeys("9658741232");
		
		//Country
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("India");
		
		//City
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("Maharashtra");
		
		//emailAddress
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-6']")).sendKeys("arjunRampal@gmail.com");
		
		//Handle DropDown
//		WebElement dropDown=driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
//		Select dd = new Select(dropDown);
		
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']")));
		int sizeDD=dropDown.getOptions().size();
		
		// get multiple option present in drop down
		List<WebElement> dd=dropDown.getOptions();
		for (WebElement i:dd)
		{
			System.out.println(i.getText());
		}
		
		
		System.out.println("ths size of drop down is : "+sizeDD);
//		dropDown.selectByIndex(2);
//		dropDown.selectByValue("Radio-2");
		dropDown.selectByVisibleText("Afternoon");
		
		
		
		//radio button
		WebElement radmale=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	
		System.out.println(radmale.isEnabled());     //true
		System.out.println(radmale.isDisplayed());    //true
		System.out.println(radmale.isSelected());   //false
		radmale.click();
		
		System.out.println(radmale.isSelected());   //true
		
		WebElement radfemale=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		
		//Handling check boxes
		driver.findElement(By.xpath("//label[contains(text(),'Sunday')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Thursday')]")).click();
		Thread.sleep(3000);
		
		//text area/input box
		
		driver.findElement(By.linkText("Software Testing Tools Training")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();
	}
	
}

package praOnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\mavenOrangeHRM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		/*
		 * to find total link on webpage
		 * driver.get("http://demo.guru99.com/test/newtours/");
		 * List <WebElement> links=driver.findElements(By.tagName("a"));
		 * System.out.println("total nubers of links is : " + links.size());
		 * for(WebElement i:links) { System.out.println(i.getText()); }
		 */
		
		/*//how to handle popups/alert on webpage
		 * driver.get("https://testautomationpractice.blogspot.com/"); // how to handle
		 * pop ups on webpage
		 * driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click()
		 * ; driver.switchTo().alert().dismiss(); Thread.sleep(3000);
		 */
		
		//how to switch between frames
		
		 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		 driver.manage().window().maximize();
		 driver.switchTo().frame("packageListFrame");
		 driver.findElement(By.linkText("org.openqa.selenium.grid.sessionmap")).click();;
	
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("packageFrame");
		 driver.findElement(By.linkText("NullSessionMap")).click();;
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("classFrame");
		 driver.findElement(By.linkText("Deprecated")).click();
		 driver.close();
		
	}

}

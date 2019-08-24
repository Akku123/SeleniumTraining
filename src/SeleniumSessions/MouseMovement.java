package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\akash\\Downloads\\GeckoDriver\\geckodriver.exe");
		WebDriver driver =	new FirefoxDriver();
		
		
		driver.get("https://www.crmpro.com");
driver.findElement(By.name("username")).sendKeys("Akashg");
		
		driver.findElement(By.name("password")).sendKeys("Qait@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		
		
		
		
		

	}

}

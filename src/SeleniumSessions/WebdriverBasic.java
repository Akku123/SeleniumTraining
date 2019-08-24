package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//WebDriver is a interface, 
		// driver is a reference 
		//FirefoxDriver() is a class
		//new Firefox() is a object
	
		//System.setProperty(key, value)
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\akash\\Downloads\\GeckoDriver\\geckodriver.exe");
		WebDriver driver =	new FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Expected Text");
		}
			else {
				System.out.println("Not Expected Text");
		}
		
		alert.accept();
		

	}

}

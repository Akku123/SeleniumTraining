package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();	
		//options.addArguments("--disable-notifications");
		//Map<String, Object> prefs = new HashMap<String, Object>();
		//prefs.put("profile.default_content_setting_values.notifications", 1);
		
	//	options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\akash\\Downloads\\GeckoDriver\\geckodriver.exe");
		WebDriver driver =	new FirefoxDriver();
		
		//WebDriver driver =	new ChromeDriver(options);
		
		driver.get("https://html.com/input-type-file/");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\akash\\Desktop\\SAve.txt");
		

	}

}

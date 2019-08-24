package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\akash\\Downloads\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://jqueryui.com/droppable/");

		// Dynamic in nature is suppose page is loaded in 2 sec than remaining sec are
		// ignored
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}

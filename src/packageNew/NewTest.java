package packageNew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	
	
  @Test
  public void VerifyHomePage() throws InterruptedException {
	  
	
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
       
		
		//String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = "";
		String expected = "Welcome: Mercury Tours";
        
        String actual = "";
        driver.get(baseUrl);

 
        //actualTitle = driver.getTitle();
        actual = driver.getTitle();
        
       // if (actualTitle.contentEquals(expectedTitle)){
           // System.out.println("Test Passed!");								
       // } else {
            //System.out.println("Test Failed");
        //		}
        
        Assert.assertEquals(actual, expected);
        
        driver.manage().window().maximize();
        
        Assert.assertTrue(actual.equals(expected), "Fail");
        System.out.println("True");	
        
        
        Thread.sleep(20000);

       WebElement myElement =  driver.findElement(By.xpath("(//li[@class='dropdown']//a[contains(text(),'Selenium')])[1]"));
       myElement.click();
       Select dropdown= new Select(myElement);
       dropdown.selectByVisibleText("Table Demo");
      
        List<WebElement> elementsRoot = driver.findElements(By.xpath("//table//tr//td[1]"));

        

        
        /*
      
        try {
        	
        	driver.findElement(By.id("submit")).click();
        	
       	} catch (WebDriverException e) {
        	
        	System.out.println(“An exceptional”);
        	
        	}
        */
        
        
        
        
        
        

        
        

   

  }
}

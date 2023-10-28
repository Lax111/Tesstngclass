package testngrevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class rytryryt {

	private WebDriver driver;

	  @BeforeMethod
	  public void setUp()
	     
	      {
	    
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	      driver = new ChromeDriver();      
	      }  
	      @Test
	      public void openBrowser() {
	      
	       driver.get("http://www.webdriveruniversity.com/"); 
	        
	      }
	        
	      @AfterMethod
	      public void tearDown() {
	        driver.quit();
	        
	       
}}

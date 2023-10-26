package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment {

	   

	 WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        // Set up the WebDriver (e.g., ChromeDriver)
	    	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
	    }

	    @Test
	    public void openURL() {
	        // Navigate to the URL you want to open
	        driver.get("https://www.example.com");
	        
	        // You can add any other test steps or assertions related to the opened page here.
	    }

	    @AfterTest
	    public void tearDown() {
	        // Close the WebDriver
	        if (driver != null) {
	            driver.quit();
	}
	    }}

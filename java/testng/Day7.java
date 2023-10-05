package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day7 {

	WebDriver driver;
	
	@BeforeMethod
	
	public void BeforeMethod() {
	
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.webdriveruniversity.com/");	
}
	
@Test
public void TestOne() {
	
	// WebDriverUniversity.com
			//assertEquals(expected,actual)
			//assertNotEquals(expected,actual)
			//assertTrue(condition)
			//assertFalse(condition)
			
			// API 
			//assertNull(object)
			//assertNotNull(Object)
			
//	String actualTitle = driver.getTitle();
//	String expectedTitle = "";
//	assertEquals(actualTitle,expectedTitle);
	
	
	
	
	
	
	
	
	
	
	
	
}}
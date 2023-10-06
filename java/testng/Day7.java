package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
//@Test
//public void TestOne() {
	
	// WebDriverUniversity.com
			//assertEquals(expected,actual)
			//assertNotEquals(expected,actual)
			//assertTrue(condition)
			//assertFalse(condition)
			
			// API 
			//assertNull(object)
			//assertNotNull(Object)
			
	String actualTitle = driver.getTitle();
	String expectedTitle = "WebDriverUniversity.com";
	assertEquals(actualTitle,expectedTitle);
	
	// WebDriver | Contact Us
	
	WebElement contactus = driver.findElement(By.cssSelector("#contact-us"));
	JavascriptExecuter je = (JavascriptExecuter)driver;
	je.executeScript("arguments[0].removeAttribute('target')",contactus);
	contactus.click();
	actualTitle = driver.getTitle();
	assertNotEquals(actualTitle,expectedTitle);
	
}
@Test
public void TestcaseTwo() {
	
	// webdriver university
	
	String currentUrl = driver.getCurrentUrl();
	
	currentUrl.contains("university");
	assertTrue(avail);
	
	// google 
	driver.get("https://www.google.com");	
    driver.getCurrentUrl().contains("university");	
	assertFalse(avail);
	
}
	@AfterMethod
	public void AfterMethod() {
	driver.close();
	
	
	
}}
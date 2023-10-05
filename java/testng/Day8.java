package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day8 {

	
	// Hard assertion and Soft assertion	
	
	WebDriver driver;
	
	@Test
	public void testCaseOne() {
		
		// Hardassertion
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");

		// verify title
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "WebDriverUniversity.com");
		
		// verify url
		
		boolean avail = driver.getCurrentUrl().contains("university");
		Assert.assertTrue(avail);
		
		// verify element displayed
		
		boolean avail2 = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
		Assert.assertTrue(avail2);
		driver.close();
		
	}
	@Test
	public void testCaseTwo() {
		
		// softassertion
		
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.webdriveruniversity.com/");

	SoftAssert ss = new SoftAssert();
	
	// verify title
	
	String actualTitle = driver.getTitle();
	ss.assertEquals(actualTitle, "WebDriverUniversity.com");
	
	// verify url
	
	boolean avail = driver.getCurrentUrl().contains("university");
	ss.assertTrue(avail);
	
	// verify element displayed
	
	boolean avail2 = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
	ss.assertTrue(avail2);
	driver.close();
	
	ss.assertAll();
	
	
	
	
	}
}

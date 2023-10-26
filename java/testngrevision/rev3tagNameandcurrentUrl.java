package testngrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class rev3tagNameandcurrentUrl {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		String yy = "2024";
		String mm = "2024";
		String dd = "2024";
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
	    driver.get("http://www.webdriveruniversity.com/Datepicker/index.html");
	
		driver.findElement(By.id("datepicker")).click();
		test1.SelectDate(driver, mm , yy , dd);
	}
	
	@Test
	public void TestCaseOne() {
		boolean avail = driver.getCurrentUrl().contains("picker");
		Assert.assertTrue(avail);
	}
		
	@Test
	public void TestCaseTwo() {
		boolean avail = driver.findElement(By.tagName("h1")).isDisplayed();
		Assert.assertTrue(avail);
	}	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}	
}	


package testngrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softasserthardassertrev10 {
WebDriver driver;
	
@Test
public void testContactForm() {
	
	System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();	
	driver.get("https://www.saucedemo.com/v1");
	
	SoftAssert sf = new SoftAssert();
	
	//validate title
	String title = driver.getTitle();
	sf.assertEquals(title,"Swag Labs" );
	
	//validate currentURL
	boolean currenturl = driver.getCurrentUrl().contains("v1");
	sf.assertTrue(currenturl);
	
	//Validate login
	
	driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
	driver.findElement(By.cssSelector("#login-button")).click();	
	driver.quit();
	
	sf.assertAll();	
}
}

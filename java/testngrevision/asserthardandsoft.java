package testngrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class asserthardandsoft {

	WebDriver driver;
	
	@Test
	public void testContactForm() {
		
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");
		
		//validate title
		String title = driver.getTitle();
		Assert.assertEquals(title, "Swag Labs");
		
		//validate url
		boolean avail = driver.getCurrentUrl().contains("v1");
		Assert.assertTrue(avail);
		
		//validate login
		
//		driver.findElement(By.cssSelector("user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("password")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("login_button")).click();
//		driver.quit();
//		
		
		
	}
	
	
}

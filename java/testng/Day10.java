package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day10 {

	WebDriver driver;
	
	@Parameters({"username","password"})
	@Test
	
	public void TestCase1(String un, String pwd) {
	System.out.println("case 1");
		//System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(avail);
		
		driver.close();	
}	 
	
	@Parameters({"username","password"})
	@Test
	
	public void TestCase2(String un, String pwd) {
		System.out.println("case 2");
		//System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(avail);
		
		driver.close();	
}	 
	
	@Parameters({"username","password"})
	@Test
	
	public void TestCase3(String un, String pwd) {
		System.out.println("case 3");
		//System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(avail);
		
		driver.close();	
}	 
	
	@Parameters({"username","password"})
	@Test
	
	public void TestCase4(String un, String pwd) {
		System.out.println("case 4");
		//System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(avail);
		
		driver.close();	
}	 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
}

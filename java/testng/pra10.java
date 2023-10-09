package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pra10 {
	
WebDriver driver;

@Test

public void TestCase1() {
	System.out.println("case 1");
	
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.id("user-name"));
	driver.findElement(By.id("password"));
	driver.findElement(By.id(""));
	
}
}

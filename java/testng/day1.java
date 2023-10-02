package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void test() {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
	
		driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		
		 
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		 
		//Dash board element
		 
		 username.sendKeys("standard_user");
		 password.sendKeys("secret_sauce");
		 login.click();
		 System.out.println("hello");

	}

}

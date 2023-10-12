package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day16 {

WebDriver driver;	
	
	@Test
	public void CalenderTest() {
		
		String month = "January";
		String year = "2024";
		String date = "1";
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
			
		driver.get("https://www.webdriveruniversity.com/Datepicker/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		//selectDate(driver,month,year);
	}
	
	
	
	
	
}

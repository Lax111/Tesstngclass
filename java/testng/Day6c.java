package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day6c {

	
	WebDriver driver;

	@Test
	public void TestCase1() throws InterruptedException {
	
	//Javascript executor to click on element
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http://www.webdriveruniversity.com/");

	WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
JavascriptExecutor je = (JavascriptExecutor)driver;
je.executeScript("arguments[0].setAttribute('data-cy','two')",scrollElement);  
//je.executeScript("arguments[0].removeAttribute('data-cy')",scrollElement);  
String attributeValue =  scrollElement.getAttribute("data-cy");//two
System.out.println(attributeValue);


//driver.close();
}

}
	
	
	
	
	
	
	


package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test6f {

	
	WebDriver driver;

	@Test
	public void TestCase1() throws InterruptedException {
	
	
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http://www.webdriveruniversity.com/Actions/index.html");

	Actions ac = new Actions(driver);
	WebElement  draggable = driver.findElement(By.id("draggable"));
	WebElement  droppable = driver.findElement(By.id("droppable"));
	ac.dragAndDrop(draggable, droppable).build().perform();
	Assert.assertEquals(droppable.getText(), "Dropped");
	driver.close();
	}
}

	
	


	
	
	

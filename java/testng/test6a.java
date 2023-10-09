package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test6a {
	

WebDriver driver;

	@Test
	public void TestCase1() {
	
	//Javascript executor to click on element
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http://www.webdriveruniversity.com/Actions/index.html");
				Actions ac = new Actions(driver);
				WebElement e = driver.findElement(By.id("double click"));
				ac.doubleClick(e).build().perform();
				String className = e.getAttribute("class");
				Assert.assertEquals(className, "div-double-click double");
	driver.close();
}
}
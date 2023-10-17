package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calenderhandle {

WebDriver driver;
	
	@Test
	public void TestCaseOne() {
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	driver.get("https://www.makemytrip.com/flights/");
	//driver.get("http://spicejet.com/");
	
	WebElement date = driver.findElement(By.className("blackText font20 code lineHeight36"));
	String dateVal = "15-10-2023";
	
	selectDateByJS(driver, date, dateVal);
	
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateValue) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);
	
	
	
	
	
	
	
	}
}

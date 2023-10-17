package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalendarHandle {

	WebDriver driver;
	 @BeforeMethod
	    public void setup() {
	        // Set the system property for ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	        
	        // Initialize the WebDriver
	        driver = new ChromeDriver();
	        
	        // Configure WebDriver settings
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    }

	    @Test
	    public void handleCalendar() {
	        // Navigate to the webpage
	        driver.get("https://www.makemytrip.com/flights/");
	        
	        // Find the date input element
	        WebElement dateElement = driver.findElement(By.className("blackText font20 code lineHeight36"));
	        
	        // Specify the date in the required format
	        String dateValue = "15-10-2023";
	        
	        // Use JavaScript to set the date
	        selectDateByJS(dateElement, dateValue);
	    }

	    public void selectDateByJS(WebElement element, String dateValue) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('value', '" + dateValue + "');", element);
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	
}}}

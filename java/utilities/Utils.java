package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {

	private WebDriver driver;

	public Utils(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifyTitle(WebDriver driver, String expectedTitle) {
		String actualTitle = driver.getTitle();
		return actualTitle.equals(expectedTitle);
	}

	public void selectDropDown(WebDriver driver,WebElement dropDown, String optionToselect) {
		Select select = new Select(dropDown);
		select.deselectByVisibleText(optionToselect);
	}

	public void selectDropDownByIndex(WebDriver driver,WebElement dropDown, int optionToselect) {
		Select select = new Select(dropDown);
		select.selectByIndex(optionToselect);
	}
	// Switch to an iframe by index
	public static void switchToIframeByIndex(WebDriver driver, int index) {
        driver.switchTo().frame(index);
}
	// scroll to the bottom of page utility in Java Selenium
	 public static void scrollToBottom(WebDriver driver) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
}	
	
	 // Build the complete file path
//	 String destinationDirectory = "C:\\Users\\chapa\\eclipse-workspace\\testng\\src\\test\\java\\testng";
//
//     try {
//         // Copy the screenshot file to the destination directory
//         FileUtils.copyFile(source, new File(screenshotPath));
//         System.out.println("Screenshot taken and saved at: " + screenshotPath);
//     } catch (IOException e) {
//         System.err.println("Failed to capture screenshot: " + e.getMessage());
//     }
 }
	

	
	
	

//switch to a iframe 

	// to wait for a element to be present 

	// a utility function to take a screen short

	// a utility function to scroll to bottom of page 










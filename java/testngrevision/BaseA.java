package testngrevision;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class BaseA {

	public static WebDriver driver;

	public static void initialization() {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	//private File result;

	public void failed(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus())
		try {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File src = screenshot.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(scrFile, new File(".//screenshot//" + screenshotsfilename + ".png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		FileUtils.copyFile(src, new File("./Screenshot/"+ result.getName()+System.currentTimeMillis()+".png"));
		System.out.println("Successfully captured");
		}
		catch(Exception e)
		{
			System.out.println("Exception while taking screenshot" + e.getMessage());
		}
		
	}

	public void onTestStart() {
		// TODO Auto-generated method stub

	}

}

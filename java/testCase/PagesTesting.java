package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.PagesTest;

public class PagesTesting {
	private WebDriver driver;
	private PagesTest pageTest;
	
	@BeforeMethod
	public void setUp() 
	{
		String path="C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe";
		String url="https://www.webdriveruniversity.com/Contact-Us/contactus.html";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		pageTest = new PagesTest(driver);
	}
	@Test
	public void submitTest()
	{
		pageTest.EnterFName("Laxmi");
		pageTest.EnterLName("Chapagain");
		pageTest.EnterEmail("laxmi.chapagain@Gmail.com");
		pageTest.EnterMessage("I am practing TestNG");
		pageTest.BtnSubmit();
	}
	@Test
	public void submitTest1()
	{
		
	}
	@Test
	public void submitTest2()
	{
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}

package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Totallink 
{

	WebDriver driver;
	@Test
	public void totallink1() 
	{
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	
	driver.get("http://www.webdriveruniversity.com/");
	
	 	List<WebElement> tl = driver.findElements(By.tagName("a"));
	System.out.println("total links: " + tl.size());
	
	for(int i = 0;i< tl.size();i++) 
	{
		String text = tl.get(i).getText();
		if(!text.isEmpty()) 
		{
			System.out.println(i+ " : "+text);
		}
	}}
	
	@Test
	public void brokenlink2() 
	{
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	
	driver.get("http://www.webdriveruniversity.com/");
	
	 	List<WebElement> bt = driver.findElements(By.tagName("a"));
	
	System.out.println("broken links: " + bt.size());
	for(int i = 0;i< bt.size();i++) 
	{
		String text = bt.get(i).getText();
		if(!text.isEmpty()) 
		{
			System.out.println(i+ " : "+text);
			//System.out.println(text);
		}
	}}}




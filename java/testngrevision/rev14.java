package testngrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class rev14 extends BaseA {

	@Test
	public void searchGoogle() {
	
		 driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("TestNG Selenium");
		searchBox.submit();
		Assert.assertTrue(false);
		
	}
}

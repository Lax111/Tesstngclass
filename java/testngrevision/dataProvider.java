package testngrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	WebDriver driver;
	
//@DataProvider(name="users")	
//	public object [][] loginInfo(){
//	return new object[][] {
//	
//		{"standard_user","secret_sauce"},
//		{"locked_out_user","secret_sauce"},
//		{"problem_user","secret_sauce"},
//		{"performance_glitch_user","secret_sauce"}
//		
//};
//}
@Test(dataProvider = "users")
	public void loginTestcase(String un , String pw) {
	
	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	
	driver.findElement(By.cssSelector("user-name")).sendKeys(un);
	driver.findElement(By.cssSelector("password")).sendKeys(pw);
	driver.findElement(By.cssSelector("login_button")).click();
	driver.quit();
	
}}

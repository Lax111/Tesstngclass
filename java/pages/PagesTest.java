package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagesTest 
{
	private WebDriver driver;
	// Elements
	By FirstName = By.xpath("//*[@id=\"contact_form\"]/input[1]");
	By LastName = By.xpath("//*[@id=\"contact_form\"]/input[2]");
	By Email = By.xpath("//*[@id=\"contact_form\"]/input[3]");
	By Message = By.xpath("//*[@id=\"contact_form\"]/textarea");
	By Submit = By.xpath("//*[@id=\"form_buttons\"]/input[2]");
	//Constructor
	public PagesTest(WebDriver dr)
	{
		this.driver = dr; 
	}
	//Method
	public void EnterFName(String fname) 
	{
		driver.findElement(FirstName).sendKeys(fname);
	}
	public void EnterLName(String lname) 
	{
		driver.findElement(LastName).sendKeys(lname);
	}
	public void EnterEmail(String email) 
	{
		driver.findElement(Email).sendKeys(email);
	}
	public void EnterMessage(String message) 
	{
		driver.findElement(Message).sendKeys(message);
	}
	public void BtnSubmit() 
	{
		driver.findElement(Submit).click();
	}
	public void Submit(String fname, String lname, String email, String message) 
	{
		EnterFName(fname);
		EnterLName(lname);
		EnterEmail(email);
		EnterMessage(message);
		BtnSubmit();
		
	}
}

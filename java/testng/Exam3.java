package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exam3 {

	@BeforeMethod
	public void beforeMethod() {
	System.out.println("I will run before method");
	}
	
	@AfterMethod
	public void afterMethod() {
	System.out.println("I will run after method");
	}
	
	@Test(priority =2)
	public void testcase1() {
		System.out.println("Test case 1");
	}
	
	@Test(priority =1)
	public void testcase2() {
		System.out.println("Test case 2");
	}
	@Test(priority =0)
	public void testcase3() {
		System.out.println("Test case 3");
	}
	@Test(priority =-1)
	public void testcase4() {
		System.out.println("Test case 4");
	}
	
	@Test(priority =-2)
	public void five() {
		System.out.println("Test case 5");
	}
	@Test(priority =-2)
	public void six() {
		System.out.println("Test case 6");
	}	
	
}
	
	
	
	
	
	


package testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 {

	@BeforeMethod
	public void beforeMethod() {
	System.out.println("I will run before every method");
	}
	
	@AfterMethod
	public void afterMethod() {
	System.out.println("I will run after every method");
	}
	
	@Test(priority =2)
	public void testcase1() {
		System.out.println("Test case one");
	}
	
	@Test(priority =1)
	public void testcase2() {
		System.out.println("Test case two");
	}
	@Test(priority =0)
	public void testcase3() {
		System.out.println("Test case three");
	}
	@Test(priority =-1)
	public void testcase4() {
		System.out.println("Test case four");
	}
	
	@Test(priority =-2)
	public void five() {
		System.out.println("Test case five");
	}
	@Test(priority =-2)
	public void six() {
		System.out.println("Test case six");
	}	
	
}

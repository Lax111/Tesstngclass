package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class Days11e {

	
	@Test(priority = 1)
	public void TestFour() {
		System.out.println("Test case four pass");
	}
	@Ignore
	@Test(priority = 2)
	public void TestFive() {
		System.out.println("Test case five pass");
	}
	@Test(priority = 3)
	public void TestSix() {
		System.out.println("Test case six pass");
	}
	
	
}

package testngrevision;

import org.testng.annotations.Test;

public class rev6priority {

	@Test(priority = 0)
	public void Mango() {
		System.out.println("Test case Mango");
	}
	
	@Test(priority = -3)
	public void Apple() {
		System.out.println("Test case Apple");
	}
	
	@Test(priority = 2)
	public void Orange() {
		System.out.println("Test case Orange");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

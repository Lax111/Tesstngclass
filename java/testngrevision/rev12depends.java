package testngrevision;

import org.testng.Assert;
import org.testng.annotations.Test;

public class rev12depends {

@Test(groups = "login")	
public void TestCashFour() {
	System.out.println("Testcase four");
	Assert.assertEquals(true, true);	
}

@Test(groups = "login")	
public void TestCashFive() {
	System.out.println("Testcase five");
	Assert.assertEquals(true, true);	
}

@Test(groups = {"login","regression"})	
public void TestCashSix() {
	System.out.println("Testcase six");
	Assert.assertEquals(true, true);	
}
}
			
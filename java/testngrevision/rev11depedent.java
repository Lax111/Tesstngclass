package testngrevision;

import org.testng.Assert;
import org.testng.annotations.Test;

public class rev11depedent {

@Test()	
public void TestCaseOne() {
	System.out.println("Testcase one pass");
	Assert.assertEquals(true, true);
}
@Test(dependsOnMethods = "TestCaseOne")	
public void TestCashTwo() {
	System.out.println("Testcase two pass");
	Assert.assertEquals(true, true);	
}

@Test(dependsOnMethods = "TestCaseTwo")	
public void TestCashThree() {
	System.out.println("Testcase three pass");
	Assert.assertEquals(true, true);	
}
	
@Test(dependsOnMethods = "TestCaseThree")	
public void TestCashFour() {
	System.out.println("Testcase Four pass");
	Assert.assertEquals(true, true);	
}
	
	
	
	
	
	
	
	
}

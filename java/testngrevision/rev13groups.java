package testngrevision;

import org.testng.Assert;
import org.testng.annotations.Test;

public class rev13groups {

@Test(groups = "regression")
public void testCaseOne() {
	System.out.println("One testcase pass");
	Assert.assertEquals(true, true);
}
	
@Test(groups = "regression")
public void testCaseTwo() {
	System.out.println("Two testcase pass");
	Assert.assertEquals(true, true);
}
	
@Test(groups = "regression")
public void testCaseThree() {
	System.out.println("Three testcase pass");
	Assert.assertEquals(true, true);
  }	
}

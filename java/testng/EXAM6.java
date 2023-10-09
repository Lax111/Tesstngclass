package testng;

import org.testng.annotations.Test;

public class EXAM6 {

	@Test(groups = {"smoke"})
	public void testCase1() {
		System.out.println("smoke test1");
	}

	@Test(groups = {"smoke","regression"})
	public void testCase2() {
		System.out.println("smoke test2");
	}
	
	@Test(groups = {"regression"})
	public void testCase3() {
		System.out.println("regression test3");
	}

@Test(groups = {"login"})
public void testCase4() {
	System.out.println("login test case 1");
}
@Test(groups = {"smoke"})
public void testCase5() {
	System.out.println("smoke 5");
}
@Test(groups = {"login"})
public void testCase6() {
	System.out.println("login test case 2");
}}

package testngrevision;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class screenshotTest extends BaseA {

	@BeforeMethod
	public void setup() {
		initialization();
}
@AfterMethod
public void tearDown() {
	
}
@Test
public void takesScreenshotTest() {
	Assert.assertEquals(false, true);
}

}
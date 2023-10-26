package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Login;
import pages.ProductPage;

public class LoginTest {
	private WebDriver driver;
    private Login loginPage;
    private ProductPage productPage;
    
    @BeforeMethod
    public void setUp() 
    {
    	System.setProperty("webdriver.Chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver (3)\\chromedriver\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new Login(driver);
        productPage = new ProductPage(driver);
    }

    @Test
    public void loginAndAddToCartTest() {
        loginPage.login("standard_user","secret_sauce");
        productPage.clickAddToCartButton(0);
        productPage.clickShoppingCartBadge();
     
    }

    @Test
    public void loginWithoutPassword() {
        loginPage.loginwithoutPassword("standard_user");
        boolean avail = loginPage.errorState();
        Assert.assertTrue(avail);
    }

    @Test
    public void verifyTitleForLogin() {
        String actualTitle = loginPage.verifyTitle();
        String expectedTitle = "Swag Labs";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterMethod
    public void tearDown() 
    {
        driver.quit();
    }
}







package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Login;
import pages.ProductPage;

public class LoginTest {
	private WebDriver driver;
    private Login loginPage;
    private ProductPage productPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chapa\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
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

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}







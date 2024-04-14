package packageA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PackageB.DriverInitializer;
import PackageB.PageLocators;



public class Class1 {
    WebDriver driver;
    PageLocators pageLocators;

    @BeforeTest
    public void setUp() {
        driver = DriverInitializer.getDriver();
        pageLocators = new PageLocators(driver);
    }

    @Test
    public void signIn() {
        // Navigate to Amazon Sign In URL
        driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        // Enter username and password
        PageLocators.usernameField.sendKeys("hariraghu999@outlook.com");
        PageLocators.passwordField.sendKeys("Hari@2699");
        // Click login button
        PageLocators.loginButton.click();
    }


        @Test
        public void searchProduct() {
            PageLocators.searchInput.sendKeys("iphone 14");
            PageLocators.searchbtn.click();
        }
    }



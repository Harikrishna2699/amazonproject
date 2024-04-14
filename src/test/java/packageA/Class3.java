package packageA;
import PackageB.DriverInitializer;
import PackageB.PageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static PackageB.PageLocators.*;
public class Class3 {
    WebDriver driver;
    PageLocators pageLocators;

    @BeforeTest
    public void setUp() {
        driver = DriverInitializer.getDriver();
        pageLocators = new PageLocators(driver);
    }

    @Test
    public void VerifyCart()
    {
        Wait<WebDriver> wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOf(verify));
        System.out.println("verified iphone, it is present in cart");
    }

    @Test
    public void delcart()
    {
     Wait<WebDriver> wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
     wait2.until(ExpectedConditions.elementToBeClickable(Deletecart));
        System.out.println("product in cart has been deleted");
    }


    @Test
    public void signout()
    {
        Actions ac2 = new Actions(driver);
        ac2.moveToElement(drpdwn).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        signout.click();

    }
    }








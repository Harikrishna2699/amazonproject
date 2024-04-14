package packageA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PackageB.DriverInitializer;
import PackageB.PageLocators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static PackageB.PageLocators.*;

public class Class2 {
    WebDriver driver;
    PageLocators pageLocators;

    @BeforeTest
    public void setUp() {
        driver = DriverInitializer.getDriver();
        pageLocators = new PageLocators(driver);
    }
    @Test
    public void windowHandling()
    {
        PageLocators.ClickProduct.click();
        Set<String> str = driver.getWindowHandles();
        List<String> li = new ArrayList<>(str);
        System.out.println(li.size());
        String s1 = li.get(1);
        driver.switchTo().window(s1);

    }
    @Test
    public void AddToWishlist() {

        Actions ac = new Actions(driver);
        ac.moveToElement(drpdwn).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        lstclick.click();}


    @Test
    public void AddToCart(){
        addtocart.click();
        viewcart.click();
    }}

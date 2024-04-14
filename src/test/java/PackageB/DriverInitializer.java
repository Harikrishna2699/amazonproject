package PackageB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitializer {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Initialize ChromeDriver instance
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().refresh();
            driver.manage().deleteAllCookies();
        }
        return driver;
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

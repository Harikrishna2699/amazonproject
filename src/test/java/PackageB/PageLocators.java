package PackageB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageLocators {
    WebDriver driver;
    public PageLocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='ap_email']")
    public static WebElement usernameField;

    @FindBy(xpath = "//input[@id='ap_password']")
    public static WebElement passwordField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public static WebElement loginButton;

    @FindBy(id = "twotabsearchtextbox")
    public static  WebElement searchInput;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
   public static WebElement searchbtn;

    @FindBy(xpath = "//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][normalize-space()='Apple iPhone 14 (128 GB) - Midnight']")
    public static WebElement ClickProduct;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public static WebElement drpdwn;

    @FindBy(xpath = "(//span[text()='Shopping List'])[1]")
    public static WebElement lstclick;

    @FindBy(xpath="//a[@class='a-button-text a-text-center']")
    public static WebElement addtocart;

    @FindBy(xpath = "//span[contains(text(),'View Cart')]")
    public static WebElement viewcart;

   @FindBy(xpath = "//span[text()='Apple iPhone 14 (128 GB) - Midnight'][2]")
    public static WebElement verify;

   @FindBy(xpath = "(//span[@class='a-size-small sc-action-delete'])[1]")
    public static WebElement Deletecart;

   @FindBy(xpath =  "//span[text()='Sign Out']")
    public static WebElement signout;

}

package Pages;

import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class AddProduct extends BaseClass {

    public static WebDriver driver;

        @FindBy(xpath = "//img[@src='http://automationpractice.com/img/logo.jpg']")
        private WebElement Logo;
        @FindBy (xpath = "//a[@class='product-name']")
        private WebElement Item;
        @FindBy (xpath = "(//span[contains(text(),'Add to cart')])[1]")
        private WebElement cart;
        @FindBy (xpath = "//span[contains(text(),'Proceed to checkout')]")
        private WebElement Checkout;

    public AddProduct(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectmyitem()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        Logo.click();
        Item.click();
        cart.click();
        Checkout.click();
    }
}

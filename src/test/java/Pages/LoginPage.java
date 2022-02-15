package Pages;

import Base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class LoginPage extends BaseClass {
    WebDriver driver;
    String expectedurl = "http://automationpractice.com/index.php?controller=authentication";

    @FindBy(linkText = "Sign in")
    WebElement signInBtn;
    @FindBy(id = "email")
    WebElement mail;
    @FindBy(id = "passwd")
    WebElement pwd;
    @FindBy(id = "SubmitLogin")
    WebElement loginBtn;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement email;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginPage()
    {
        signInBtn.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        mail.sendKeys(prop.getProperty("email"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        pwd.sendKeys(prop.getProperty("password"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        loginBtn.click();
    }

    public void verifyLogin()
    {
        Assert.assertEquals(driver.getCurrentUrl(), expectedurl);
    }

    public void clickSignInButton() throws InterruptedException {
        signInBtn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        email.sendKeys("akshay@gmail.com");
        Thread.sleep(10000);

    }
}

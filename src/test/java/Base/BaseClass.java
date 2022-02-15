package Base;

import Pages.CallPageMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    public static Properties prop;
    WebDriver driver;
    protected CallPageMethods pageFactory;

    public BaseClass()  {
        try {
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Config\\config.properties");
            prop = new Properties();
            prop.load(ip);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @BeforeClass
    public void initialization() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        pageFactory = new CallPageMethods(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}

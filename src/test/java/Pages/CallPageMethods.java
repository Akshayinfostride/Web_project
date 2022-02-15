package Pages;

import org.openqa.selenium.WebDriver;

public class CallPageMethods {
    WebDriver driver;

    private CreateAccount signInPage;
    private LoginPage logInPage;
    private AddProduct addprod;

    public CallPageMethods(WebDriver driver)
    {
        this.driver = driver;
    }

    public CreateAccount getSignInPage() {
        if(signInPage == null) {
            signInPage = new CreateAccount(driver);
        }
        return signInPage;
    }

    public LoginPage getloginpage() {
        if(logInPage == null) {
            logInPage = new LoginPage(driver);
        }
        return logInPage;
    }

    public AddProduct getaddprod() {
        if(addprod == null) {
            addprod = new AddProduct(driver);
        }
        return addprod;
    }

}

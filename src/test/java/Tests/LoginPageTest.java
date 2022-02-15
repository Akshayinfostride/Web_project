package Tests;

import Base.BaseClass;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseClass {

    @Test
    public void loginDetails()
    {
        pageFactory.getloginpage().loginPage();
        pageFactory.getloginpage().verifyLogin();
    }
}

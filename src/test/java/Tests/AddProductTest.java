package Tests;

import Base.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddProductTest extends BaseClass {
    @Test
    public void product()
    {
        pageFactory.getloginpage().loginPage();
        pageFactory.getaddprod().selectmyitem();
    }
}



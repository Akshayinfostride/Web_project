package Tests;

import Base.BaseClass;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseClass {

    @Test
    public void createNewAccount()
    {
        pageFactory.getSignInPage().createAccount();
    }
}

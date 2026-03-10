package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountPage;
import pages.LoginPage;
import pages.RegisterPage;

public class ParaBankTest extends BaseTest {

    @Test
    public void paraBankEndToEndTest() throws InterruptedException {

        String username = "user" + System.currentTimeMillis();
        String password = "Test123";

        RegisterPage register = new RegisterPage(driver);
        register.registerUser(username, password);

        AccountPage account = new AccountPage(driver);

        Assert.assertTrue(account.verifyRegistration());

        account.logout();

        LoginPage login = new LoginPage(driver);
        login.login(username, password);

        Assert.assertTrue(account.verifyLogin());
    }
}
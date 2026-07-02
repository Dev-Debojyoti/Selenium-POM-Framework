package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {

        LoginPage loginpage = new LoginPage(driver);

        loginpage.enterUsername("admin@yourstore.com");
        loginpage.enterPassword("admin");
        loginpage.clickLogin();

        System.out.println("The title of the page is : " + driver.getTitle());

    }


}

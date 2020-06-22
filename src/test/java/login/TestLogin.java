package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

import static org.testng.Assert.assertEquals;

public class TestLogin extends BaseTests {

    @Test
    public void testLogin(){
        LoginPage loginPage = homePage.clickFormAuthentification();
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        SecureArea secureArea = loginPage.clickLoginButton();
        assertEquals(secureArea.getSecureAreaText(),"Welcome to the Secure Area. When you are done click logout below.",
                "Test Failed");
        secureArea.logOut();

    }
}

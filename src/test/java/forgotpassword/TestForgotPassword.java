package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestForgotPassword extends BaseTests {
    @Test
    public void testForgotPassword(){
        var forgottenPassword = homePage.clickForgotPassword();
        forgottenPassword.enterInput("pp@hotmail.com");
        var clickedButton = forgottenPassword.clickButtonForgotPassword();
        assertEquals(clickedButton.getConfirmationText(),"Your e-mail's been sent!","Test failed");
    }
}

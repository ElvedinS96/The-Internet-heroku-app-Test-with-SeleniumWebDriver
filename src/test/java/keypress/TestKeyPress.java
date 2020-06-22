package keypress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestKeyPress extends BaseTests {
    @Test
    public void testKeypress(){
        var keypress = homePage.clickKeypresses();
        keypress.enterInputField("A"+ Keys.BACK_SPACE);
        Assert.assertEquals(keypress.getResultText(),"You entered: BACK_SPACE","Test failed");
    }
}

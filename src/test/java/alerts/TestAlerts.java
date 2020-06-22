package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAlerts extends BaseTests {
    @Test
    public void testAlerts(){
        var alerts = homePage.clickAlerts();
        alerts.clickPromptButton();
        alerts.sendKeyssToPrompt("Test");
        alerts.confirmAlert();
        assertEquals(alerts.getResultText(),"You entered: Test","Test Failed");

    }
}

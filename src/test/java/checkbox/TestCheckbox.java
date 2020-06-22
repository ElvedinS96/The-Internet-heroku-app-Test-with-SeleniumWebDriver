package checkbox;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestCheckbox extends BaseTests {
    @Test
    public void testcheckBox(){
        var checkbox = homePage.clickCheckBox();
        checkbox.clickInput();
        assertTrue(checkbox.checkIfCheckbox1Clicked(),"False");
        assertTrue(checkbox.checkIfCheckbox2Clicked(),"False");
    }
}

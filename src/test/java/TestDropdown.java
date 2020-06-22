import base.BaseTests;
import org.testng.annotations.Test;
import pages.Dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestDropdown extends BaseTests {
    @Test
    public void testDropdown(){
        Dropdown dropdown =homePage.clickDropDown();
        dropdown.selectFromDropdown("Option 1");
        var option = dropdown.getSelectedOptions();
        assertEquals(option.size(),1,"Incorrect");
        String option1="Option 1";
        assertTrue(option.contains(option1),"Failed");
    }
}

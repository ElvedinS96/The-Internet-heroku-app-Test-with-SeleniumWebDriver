package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSlider extends BaseTests {
    @Test
    public void testSlider(){
        var slider = homePage.clickHorizontalSlider();
        slider.enterIndexToSlide(4);
        assertEquals(slider.textRange(),"2","Test failed");
    }
}

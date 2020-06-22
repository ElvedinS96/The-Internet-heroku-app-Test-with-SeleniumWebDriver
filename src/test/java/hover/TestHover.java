package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Hovers;

import static org.testng.Assert.assertEquals;

public class TestHover extends BaseTests {

    @Test
    public void testHover(){
         var hovers = homePage.clickHover();
         var hovered = hovers.hoverOver(1);
         assertEquals(hovered.getHoverText(),"name: user1","Test failed");
    }
}

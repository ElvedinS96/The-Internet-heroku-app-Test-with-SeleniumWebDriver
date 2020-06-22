package example2;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoading;

import static org.testng.Assert.assertEquals;

public class TestExample2DynamicLoading extends BaseTests {
    @Test
    public void testExample2(){
        DynamicLoading dynamicLoading = homePage.clickDynamicLoading();
        var example2 = dynamicLoading.clickExample2();
        example2.clickButton();
        assertEquals(example2.getGreetingText(),"Hello World!","Test failed");
    }
}

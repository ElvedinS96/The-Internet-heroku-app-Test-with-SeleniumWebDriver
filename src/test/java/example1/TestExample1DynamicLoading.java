package example1;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoading;

import static org.testng.Assert.assertEquals;

public class TestExample1DynamicLoading extends BaseTests {

    @Test
    public void testExample1(){
       DynamicLoading dynamicLoading = homePage.clickDynamicLoading();
       var example1 = dynamicLoading.clickExample1();
       example1.clickButton();
       assertEquals(example1.getGreetingText(),"Hello World!","Test failed");
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading {
    private WebDriver driver;

    public DynamicLoading(WebDriver driver){
        this.driver=driver;
    }
    public Example1DynamicLoading clickExample1(){
        clickLink("Example 1: Element on page that is hidden");
        return new Example1DynamicLoading(driver);
    }
    public Example2DynamicLoading clickExample2(){
        clickLink("Example 2: Element rendered after the fact");
        return new Example2DynamicLoading(driver);
    }
    private void clickLink(String linktext){
        driver.findElement(By.linkText(linktext)).click();
    }
}

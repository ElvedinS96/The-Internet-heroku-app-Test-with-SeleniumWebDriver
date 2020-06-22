package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSlider {
    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By range = By.id("range");

    public HorizontalSlider(WebDriver driver){
        this.driver=driver;
    }
    public void enterIndexToSlide(int index){
        for(int i=0;i<index;i++){
            moveSlider(Keys.ARROW_RIGHT);
        }
    }
    public void moveSlider(Keys keys){
        driver.findElement(slider).sendKeys(keys);
    }
    public String textRange(){
        return driver.findElement(range).getText();
    }
}

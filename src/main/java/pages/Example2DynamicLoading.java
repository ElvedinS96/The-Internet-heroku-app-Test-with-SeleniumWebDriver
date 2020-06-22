package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Example2DynamicLoading {
    private WebDriver driver;
    private By button = By.cssSelector("#start button");
    private By loadingElement = By.id("loading");
    private By greetingText = By.id("finish");


    public Example2DynamicLoading(WebDriver driver){
        this.driver=driver;
    }
    public void clickButton (){
        driver.findElement(button).click();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(greetingText));
    }
    public String getGreetingText(){
        return driver.findElement(greetingText).getText();
    }
}

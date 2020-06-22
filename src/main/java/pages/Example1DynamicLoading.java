package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1DynamicLoading {
    private WebDriver driver;
    private By button = By.cssSelector("#start button");
    private By loadingElement = By.id("loading");
    private By greetingText = By.id("finish");


    public Example1DynamicLoading(WebDriver driver){
        this.driver=driver;
    }
    public void clickButton (){
        driver.findElement(button).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingElement)));
    }
    public String getGreetingText(){
       return driver.findElement(greetingText).getText();
    }
}

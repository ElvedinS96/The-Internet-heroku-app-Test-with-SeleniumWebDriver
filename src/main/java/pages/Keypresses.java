package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keypresses {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public Keypresses (WebDriver driver){
        this.driver=driver;
    }
    public void enterInputField(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
}

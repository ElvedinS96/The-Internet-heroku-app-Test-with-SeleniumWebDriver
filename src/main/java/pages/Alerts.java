package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alerts {
    private WebDriver driver;
    private By jsAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By jsConfirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By jsPromptButton = By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    private By resultText = By.id("result");

    public Alerts(WebDriver driver){
        this.driver=driver;
    }
    public void clickAlertButton(){
        driver.findElement(jsAlertButton).click();
    }
    public void confirmAlert(){
        switchToAlert().accept();
    }
    public void clickConfirmButton(){
        driver.findElement(jsConfirmButton).click();
    }
    public void clickPromptButton(){
        driver.findElement(jsPromptButton).click();
    }
    public void sendKeyssToPrompt(String text){
        switchToAlert().sendKeys(text);
    }
    public Alert switchToAlert(){
        return driver.switchTo().alert();
    }
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
}

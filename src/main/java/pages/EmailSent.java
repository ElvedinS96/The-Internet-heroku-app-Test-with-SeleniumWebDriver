package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSent {
    private WebDriver driver;
    private By textConfirmation = By.id("content");

    public EmailSent(WebDriver driver){
        this.driver=driver;
    }
    public String getConfirmationText(){
       return driver.findElement(textConfirmation).getText();
    }

}

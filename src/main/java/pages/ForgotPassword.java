package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private WebDriver driver;
    private By inputForgotPassword =By.id("email");
    private By buttonForgotPasword = By.id("form_submit");


    public ForgotPassword(WebDriver driver){
        this.driver=driver;
    }

    public void enterInput(String email){
        driver.findElement(inputForgotPassword).sendKeys(email);
    }
    public EmailSent clickButtonForgotPassword(){
        driver.findElement(buttonForgotPasword).click();
        return new EmailSent(driver);
    }

}

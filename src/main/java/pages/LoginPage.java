package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameInput = By.xpath("//*[@id=\"username\"]");
    private By passwordInput = By.id("password");
    private By buttonLogin = By.className("radius");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterUsername(String username){
        driver.findElement(userNameInput).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }
    public SecureArea clickLoginButton(){
        driver.findElement(buttonLogin).click();
        return new SecureArea(driver);
    }
}

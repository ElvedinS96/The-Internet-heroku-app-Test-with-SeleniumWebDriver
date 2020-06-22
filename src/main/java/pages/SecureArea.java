package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
    private WebDriver driver;
    private By secureAreaText = By.className("subheader");
    private By logOutButton = By.className("subheader");

    public SecureArea(WebDriver driver){
        this.driver=driver;
    }
    public String getSecureAreaText () {
        return driver.findElement(secureAreaText).getText();
    }
    public LoginPage logOut(){
        driver.findElement(logOutButton).click();
        return new LoginPage(driver);
    }
}

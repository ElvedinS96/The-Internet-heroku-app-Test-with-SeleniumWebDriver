package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickFormAuthentification(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public Dropdown clickDropDown(){
        clickLink("Dropdown");
        return new Dropdown(driver);
    }
    public ForgotPassword clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }
    public Hovers clickHover(){
        clickLink("Hovers");
        return new Hovers(driver);
    }
    public Keypresses clickKeypresses(){
        clickLink("Key Presses");
        return new Keypresses(driver);
    }
    public HorizontalSlider clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    public Checkbox clickCheckBox(){
        clickLink("Checkboxes");
        return new Checkbox(driver);
    }
    public Alerts clickAlerts(){
        clickLink("JavaScript Alerts");
        return new Alerts(driver);
    }
    public DynamicLoading clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoading(driver);
    }
    public void clickLink(String link){
        driver.findElement(By.linkText(link)).click();
    }
}

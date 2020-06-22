package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {
    private WebDriver driver;
    private String checkbox1 = "//*[@id=\"checkboxes\"]/input[1]";
    private String checkbox2 = "//*[@id=\"checkboxes\"]/input[2]";


    public Checkbox(WebDriver driver){
        this.driver=driver;
    }
    public void clickInput(){
        if(!driver.findElement(By.xpath(checkbox1)).isSelected()){
            clickCheckbox(checkbox1);
        }else if(driver.findElement(By.xpath(checkbox2)).isSelected()){
            clickCheckbox(checkbox2);
        }
    }
    public void clickCheckbox(String checkbox){
        driver.findElement(By.xpath(checkbox)).click();
    }
    public boolean checkIfCheckbox1Clicked(){
        return driver.findElement(By.xpath(checkbox1)).isSelected();
    }
    public boolean checkIfCheckbox2Clicked(){
        return driver.findElement(By.xpath(checkbox2)).isSelected();
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
    private WebDriver driver;
    private By hoverClass = By.className("figure");
    private By figCaption = By.className("figcaption");
    public Hovers (WebDriver driver){
        this.driver=driver;
    }
    public Caption hoverOver(int index){
        WebElement element= driver.findElements(hoverClass).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        return new Caption(element.findElement(figCaption));
    }
    public class Caption{
        WebElement caption;
        private By tagName= By.tagName("h5");
        public Caption(WebElement caption){
            this.caption=caption;
        }
        public String getHoverText(){
            return caption.findElement(tagName).getText();
        }
    }

}

package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility {
    WebDriver driver;
    WebDriverWait Wait;


    SeleniumUtility(WebDriver driver){
        this.driver=driver;
        this.Wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void ElementToBeClick(By ClickableElements){
        driver.findElement(ClickableElements).click();
    }

    public void ElementSendKey(By SendKeyElement,String Key){
        driver.findElement(SendKeyElement).sendKeys(Key);
    }

    public String getElementText(By ElementText){
       return(driver.findElement(ElementText).getText());

    }


}

package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityOne {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        //locate the element
        By SearchInputLocator=By.id("SearchInput");
        //Find the Element
        WebElement SearchInputElement=driver.findElement(SearchInputLocator);
        //perform the action
        


    }
}

package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDownSelect {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement DropdownLanguage=driver.findElement(By.id("languageSelect"));
        Select DrpLanguage=new Select(DropdownLanguage);
        DrpLanguage.selectByValue("Italian");


    }
}

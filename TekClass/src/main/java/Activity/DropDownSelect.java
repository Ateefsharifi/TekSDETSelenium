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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement DropdownCountry=driver.findElement(By.id("countrySelect"));
        Select DrpCountrySelect=new Select(DropdownCountry);
        DrpCountrySelect.selectByValue("United States");


    }
}

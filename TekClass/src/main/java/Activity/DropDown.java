package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDown {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(2));
        Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Accessories']"))).click();

        Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Wireless Keyboard and Mouse Combo Backlit']"))).click();
        Select DrpNumber=new Select(driver.findElement(By.xpath("//img[@alt='Wireless Keyboard and Mouse Combo Backlit']")));
        DrpNumber.deselectByIndex(2);
    }
}

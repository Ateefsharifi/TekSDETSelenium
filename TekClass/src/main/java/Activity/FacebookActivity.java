package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLSelectElement;

import java.time.Duration;

public class FacebookActivity {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(2));
        Wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account"))).click();
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("Ahmad");
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname"))).sendKeys("Aziz");
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__"))).sendKeys("AAziz@gmail.com");
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email_confirmation__"))).sendKeys("AAziz@gmail.com");
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_passwd__"))).sendKeys("Aaziz@12345");
        Select SeMonth=new Select(driver.findElement(By.id("month")));

    }
}

package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SyncronizationActivity {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUnit.SECONDS.toSeconds(10)));

        WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        Wait.until(ExpectedConditions.elementToBeClickable(By.id("signinLink"))).click();
        Wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys("Example@gmail.com");
        Wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("Test@12345");
        Wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn"))).click();

        Wait.until(ExpectedConditions.elementToBeClickable(By.id("accountLink"))).click();

        driver.findElement(By.id("personalPhoneInput")).clear();
        driver.findElement(By.id("personalPhoneInput")).sendKeys("7034885295");
        driver.findElement(By.id("personalUpdateBtn")).click();

        driver.quit();


    }
}

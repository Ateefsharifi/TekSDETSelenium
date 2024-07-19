package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SyncronizationActivity {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(Duration.ofDays(TimeUnit.SECONDS.toSeconds(10)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUnit.SECONDS.toSeconds(10)));
        driver.findElement(By.id("signinLink")).click();
        driver.findElement(By.id("email")).sendKeys("Example@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Test@12345");
        driver.findElement(By.id("loginBtn")).click();

        WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.findElement(By.id("accountLink")).click();
        driver.findElement(By.id("personalPhoneInput")).clear();
        driver.findElement(By.id("personalPhoneInput")).sendKeys("7030000000");
        driver.findElement(By.id("personalUpdateBtn")).click();

        driver.quit();


    }
}

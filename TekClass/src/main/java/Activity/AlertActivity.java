package Activity;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertActivity {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(By.xpath("//*[@id='promptBtn']")).click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Mohammad");
        alert.accept();
        String Message=driver.findElement(By.xpath("//*[@id='message']")).getText();
        System.out.println(Message);
    }
}

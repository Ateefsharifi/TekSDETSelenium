package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginNavigate {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(15000);

        driver.findElement(By.id("signinLink")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("email")).sendKeys("Example@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Test@12345");
        driver.findElement(By.cssSelector(".login__submit")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#accountLink")).click();
        String Email=driver.findElement(By.cssSelector(".account__information-email")).getText();
        System.out.println(Email);

        driver.quit();

    }
}

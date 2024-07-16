package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityTwo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        Thread.sleep(2000);


        By LoginLocator= By.linkText("igninLink");
        WebElement LoginElement=driver.findElement(LoginLocator);
        LoginElement.click();

        By EmailLocator=By.name("email");
        WebElement EmailElement=driver.findElement(EmailLocator);
        EmailElement.sendKeys("Nomail@gmail.com");

        By EmailPassLocator=By.name("password");
        WebElement EmailPassElement=driver.findElement(EmailPassLocator);
        EmailPassElement.sendKeys("Abc@123");

        By EmailConfPassLocator=By.name("password");
        WebElement EmailConfPassElement=driver.findElement(EmailPassLocator);
        EmailPassElement.sendKeys("Abc@123");

        By LoginBtnLocator=By.id("loginBtn");
        WebElement LoginBtnElement=driver.findElement(LoginBtnLocator);
        LoginBtnElement.click();

        driver.quit();


    }
}

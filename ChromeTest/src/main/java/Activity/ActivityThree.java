package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityThree {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(15000);

        driver.findElement(By.xpath("//img[@alt='Video Games']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@alt='PlayStation 5 Console']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='addToCartBtn']")).click();

    }
}

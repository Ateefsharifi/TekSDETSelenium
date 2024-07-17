package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityFour {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://fireflyworlds.com/categories/all-games/");
        driver.manage().window().maximize();
        Thread.sleep(15000);

        driver.findElement(By.xpath("//contain[text(),'Learn More'")).click();


    }
}

package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TableActivity {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(By.xpath("//a[@href='/login']")).click();
        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'/plans')]")).click();

        List<WebElement> TbodyPrice=driver.findElements(By.xpath("//*/table/tbody/tr/td[3]"));
        for(WebElement EachElement:TbodyPrice){
            System.out.println(EachElement.getText());
        }

    }
}

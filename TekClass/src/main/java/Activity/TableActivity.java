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

        driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/a[2]")).click();
        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/a[2]")).click();

        List<WebElement> TbodyPrice=driver.findElements(By.xpath("//*/table/tbody/tr/td[3]"));
        for(WebElement EachElement:TbodyPrice){
            System.out.println(EachElement.getText());
        }

    }
}

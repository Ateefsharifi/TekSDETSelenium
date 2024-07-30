package Activity;
import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class InsurancePlan {
    public static void main(String[] args) throws InterruptedException {
        /*
 on Insurance app "https://dev.insurance.tekschool-students.com/", login with
supervisor / tek_supervisor credentials, and go to plans section
and Map Plan Type with Plan Base price.
Auto=$140.00
Renter=$xxx
 */
        WebDriver driver=new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        SeleniumUtility objUtility=new SeleniumUtility(driver);
        objUtility.ElementToBeClick(By.xpath("//*[@id='root']/div/div[1]/div/a[2]"));
        objUtility.ElementSendKey(By.name("username"),"supervisor");
        objUtility.ElementSendKey(By.name("password"),"tek_supervisor");
        objUtility.ElementToBeClick(By.xpath("//*/button[@type='submit']"));
        Thread.sleep(2000);
        objUtility.ElementToBeClick(By.xpath("//*/a[contains(@href,'/csr/plan')]"));
        List<WebElement> PlnPriceRow=driver.findElements(By.xpath("//*/tbody/tr"));
        for(int row=0; row<PlnPriceRow.size(); row++){
            String PlanType="//*/tbody/tr["+(row+1)+"]";
            WebElement tblRowElement=driver.findElement(By.xpath(PlanType));
           System.out.println(objUtility.getElementText(By.xpath(PlanType)));

        }



    }
}

package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityReusibility {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        SeleniumUtility obj=new SeleniumUtility(driver);
        obj.ElementToBeClick(By.id("signinLink"));

    }
}

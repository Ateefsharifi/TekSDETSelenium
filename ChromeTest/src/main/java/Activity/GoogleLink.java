package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleLink {
    public static void main(String[] args)throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        By GoogleLocator= By.id("APjFqb");
        WebElement GoogleSearchElement=driver.findElement(GoogleLocator);
        Thread.sleep(15000);
        GoogleSearchElement.sendKeys("TekSchool");

        Thread.sleep(1000);

        By GoogleBtnLocator= By.name("btnK");
        WebElement GoogleBtnSearchElement=driver.findElement(GoogleBtnLocator);
        new Actions(driver).moveToElement(GoogleBtnSearchElement).perform();
        GoogleBtnSearchElement.click();

        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("TEK SCHOOL Modern Workforce Training Bootcamp")).click();



    }
}

package firstJavaStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstJavaStep {
    WebDriver driver;
    @Given("open some type of Browser")
    public void openSomeTypeOfBrowser(){
        driver=new ChromeDriver();

    }
    @Given("navigate to retail app")
    public void navigateToRetailApp(){
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
    }
    @When("click on sign in button")
    public void clickOnSignInButton(){
        driver.findElement(By.xpath("//a[@id='signinLink']")).click();

    }
    @Then("validate you are in sign in page")
    public void validateYouSignIn(){


    }


}

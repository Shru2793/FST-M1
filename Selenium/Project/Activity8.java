package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void contactUs(){
        driver.findElement(By.linkText("Contact")).click();
        System.out.println("Title of the page is: " +driver.getTitle());

        driver.findElement(By.xpath("//input[@id ='wpforms-8-field_0']")).sendKeys("Shruthi Vangala");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vangala1@ibm.com");
        driver.findElement(By.xpath("//input[@class='wpforms-field-large']")).sendKeys("Test123");
        driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("Hi, This is Shruthi");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String confMessage = driver.findElement(By.id("wpforms-confirmation-8")).getText();
        System.out.println("Confirmation message is: " +confMessage);
    }
    @AfterClass
    public void afterClass(){
        driver.close();

    }


}

package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void firstInfoBox(){
        //Get the First info box
        String infoBox= driver.findElement(By.xpath("//h3[contains(text(),'Actionable')]")).getText();
        //Print the info box
        System.out.println("The First info Box is: " +infoBox);
        //Assertion
        Assert.assertEquals("Actionable Training", infoBox);
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
}

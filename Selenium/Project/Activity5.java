package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void myAccountPage(){
        //Find and click my account link
        driver.findElement(By.linkText("My Account")).click();
        String newTitle = driver.getTitle();
        //Print the new page Title
        System.out.println("New page Title is: " +newTitle);
        //Assertion
        Assert.assertEquals("My Account – Alchemy LMS", newTitle);
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }

}

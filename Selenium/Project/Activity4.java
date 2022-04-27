package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void secondPopCourse(){
        //Get the Second course name
        String secondPopco = driver.findElement(By.xpath("//h3[contains(text(),'Email')]")).getText();
        //print the Second course name
        System.out.println("Second Popular course Name is: " +secondPopco);
        //Assertion
        Assert.assertEquals("Email Marketing Strategies", secondPopco);
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }

}

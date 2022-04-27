package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void pageHeading(){
        //Get the Page Heading
        String heading = driver.findElement(By.cssSelector("div.uagb-ifb-title-wrap")).getText();
        //Print the Heading
        System.out.println("The Page Heading is: " +heading);
        //Assertion
        Assert.assertEquals("Learn from Industry Experts", heading);

    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }

}

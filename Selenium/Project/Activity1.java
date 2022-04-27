package Activities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeClass
    public void beforeclass(){
        driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void websiteTitle(){
        //Get the Title
        String title = driver.getTitle();
        //Print the Title
        System.out.println("The Website title is: " +title);
        //Assertion
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
    }
    @AfterClass
    public void afterclass(){
        driver.close();
    }


}

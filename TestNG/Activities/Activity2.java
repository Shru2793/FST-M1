package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
        public void beforeClass(){
        driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void testCase1(){
        String title = driver.getTitle();
        System.out.println("The Title is: " + title);
        Assert.assertEquals("Target Practice" ,title);
    }
    @Test
    public void testCase2(){
        WebElement blackButton= driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals("black", blackButton.getText());
    }
    @Test (enabled = false)
    public void testCase3(){
        String subHeading= driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
    @Test
    public void testCase4(){

        throw new SkipException("Skipping Test case");
    }

    @AfterClass
        public void afterClass(){

        driver.close();
}
}

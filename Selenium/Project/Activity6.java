package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void Login(){
        //Find and click My Account link
        driver.findElement(By.linkText("My Account")).click();
        String newTitle = driver.getTitle();

        //Print the new page Title
        System.out.println("New page Title is: " +newTitle);

        //Assertion
        Assert.assertEquals("My Account – Alchemy LMS", newTitle);

        //Find and Click Login button
        driver.findElement(By.cssSelector(".ld-login")).click();

        //Find username field
        WebElement userName = driver.findElement(By.xpath("//input[@id='user_login']"));
        //Enter keys into username field
        userName.sendKeys("root");

        //Find and enter keys into password field
        WebElement password = driver.findElement(By.cssSelector("input#user_pass.input"));
        password.sendKeys("pa$$w0rd");

        //Find and click Submit button
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

        //Find Edit profile
        String editProfile = driver.findElement(By.cssSelector(".ld-profile-edit-link")).getText();
        //Assertion for edit profile
        Assert.assertEquals("Edit profile", editProfile);
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
}

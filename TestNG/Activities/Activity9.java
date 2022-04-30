package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        Reporter.log("Starting test |");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opened browser |");

        Reporter.log("Page Title is:" +driver.getTitle() +"|");
    }
    @BeforeMethod
    public void beforeMethod(){
        Reporter.log("Test case set up started");
        driver.switchTo().defaultContent();
    }
    @Test(priority = 0)
    public void simpleAlertTestCase(){
        Reporter.log("Simple alert test case started |");
        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple alert is opened |");

        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Focus is moved to simple alert |");

        Reporter.log("Simple alert text is: " +simpleAlert.getText() +"|");
        Assert.assertEquals(simpleAlert.getText(), "This is a JavaScript Alert!");

        simpleAlert.accept();
        Reporter.log("Alert is closed.|");
        Reporter.log("Test case ended |");
    }

    @Test(priority=1)
    public void confirmAlertTestCase(){
        Reporter.log("Confirm alert test case started |");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Alert opened. |");

        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Focus moved to Alert |");
        Reporter.log("Confirm Alert Text is: " +confirmAlert.getText() +"|");
        Assert.assertEquals(confirmAlert.getText(),"This is a JavaScript Confirmation!");

        confirmAlert.accept();
        Reporter.log("Alert closed. |");
        Reporter.log("Test case ended |");
    }
    @Test (priority =2)
    public void promptAlertTestCase(){
        Reporter.log("Prompt Alert Test case started |");

        driver.findElement(By.id("prompt")).click();
        Reporter.log("Alert opened |");

        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Focus moved to alert |");
        Reporter.log("Prompt Alert text is: " +promptAlert.getText() +"|");

        Assert.assertEquals(promptAlert.getText(),"This is a JavaScript Prompt!");

        promptAlert.sendKeys("Super!");
        Reporter.log("Text entered in prompt alert |");

        promptAlert.accept();
        Reporter.log("Alert closed ");
        Reporter.log("Test case ended ");
    }
    @AfterClass
    public void tearDown(){
        Reporter.log("Ending test");
        driver.close();
    }

}

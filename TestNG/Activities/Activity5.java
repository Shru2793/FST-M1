package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void beforeTest(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void pageTitleTest(){
        System.out.println("The page Title is:" +driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Target Practice");
    }

    @Test (dependsOnMethods =  {"pageTitleTest"}, groups ={"HeaderTests"} )
    public void HeaderTest1(){
        WebElement thirdHeader = driver.findElement(By.id("third-header"));
        System.out.println("Third Header is: "+thirdHeader.getText());
        Assert.assertEquals(thirdHeader.getText(), "Third header");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups ={"HeaderTests"})
    public void HeaderTest2(){
        WebElement fifthHeader = driver.findElement(By.cssSelector("h5.ui.green.header"));
        System.out.println("Fifth Header colour is: "+fifthHeader.getCssValue("color"));
        Assert.assertEquals(fifthHeader.getCssValue("color"), "rgb(33, 186, 69)");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
    public void buttonTest1(){
        WebElement oliveButton = driver.findElement(By.xpath("//button[contains(@class,'olive')]"));
        Assert.assertEquals(oliveButton.getText(),"Olive");
    }

    @Test (dependsOnMethods ={"pageTitleTest"}, groups ={"ButtonTests"})
    public void buttonTest2(){
        WebElement button2= driver.findElement(By.cssSelector("button.brown"));
        System.out.println("Brown color CSS value is: " +button2.getCssValue("color"));
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(){
        driver.close();
    }
}

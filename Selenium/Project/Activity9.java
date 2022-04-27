package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void lesson(){
        driver.findElement(By.linkText("My Account")).click();

        driver.findElement(By.cssSelector(".ld-login")).click();

        WebElement userName = driver.findElement(By.xpath("//input[@id='user_login']"));
        userName.sendKeys("root");
        WebElement password = driver.findElement(By.cssSelector("input#user_pass.input"));
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

        driver.findElement(By.xpath("//li[@id='menu-item-1508']")).click();

        driver.findElement(By.cssSelector("a.btn.btn-primary")).click();

        driver.findElement(By.xpath("//div[contains(text(),'Developing')]")).click();
        System.out.println("Title of the page is: "+driver.getTitle());
        Assert.assertEquals("Developing Strategy – Alchemy LMS", driver.getTitle());
    //NEXT Lesson
        driver.findElement(By.xpath("//span[contains(text(), 'Next Lesson')]")).click();
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }


}

package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Activity7 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void courses(){
        driver.findElement(By.linkText("All Courses")).click();
        List<WebElement> courses = driver.findElements(By.className("ld_course_grid"));

        System.out.println("Number of courses are: " +courses.size());
    }

    @AfterClass
    public void afterClass(){
        //driver.close();
    }

}

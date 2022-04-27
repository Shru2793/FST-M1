package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Page Title is: "+driver.getTitle());

        //Find and enter keys into username field
        driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
        //Find and Enter keys into password field
        driver.findElement(By.xpath("//input[contains(@class ,'password')]")).sendKeys("password");
        //find Login button and click
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();

        //Login message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message is: "+message);
        driver.close();


    }
}

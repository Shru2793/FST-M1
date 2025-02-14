package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/ajax");
        System.out.println("Page Title is: "+driver.getTitle());
         WebElement changeButton = driver.findElement(By.cssSelector("button.violet"));
         changeButton.click();
         //Wait for the Text Hello
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

        String ajaxText = driver.findElement(By.id("ajax=content")).getText();
        System.out.println("Text is: "+ajaxText);

        //Wait for the late text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

        String lateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println("Late text is: "+lateText);
        //Close the browser
        driver.close();
    }

}

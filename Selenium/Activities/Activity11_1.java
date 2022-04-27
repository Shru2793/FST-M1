package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Find Alert button and click
        driver.findElement(By.id("simple")).click();
        //Wait until alert is displayed
        wait.until(ExpectedConditions.alertIsPresent());
        //switch to  alert
        Alert alert =  driver.switchTo().alert();
        //Print the text on alert
        String alertText = alert.getText();
        System.out.println("Text on Alert: " +alertText);
        //click ok on alert
        alert.accept();
        //close the browser
        driver.close();




    }
}

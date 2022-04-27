package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity11_3 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Find prompt alert and click it
        driver.findElement(By.cssSelector("button#prompt")).click();

        //Switch to alert
        Alert promptAlert = driver.switchTo().alert();

        //Get the text on alert
        System.out.println(promptAlert.getText());

        //type in the box
        promptAlert.sendKeys("Yes, you are!");

        //Close the alert with ok
        promptAlert.accept();

        //Close the browser
        driver.close();
    }
}

package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Find Confirm alert button and click it
        WebElement confirmButton= driver.findElement(By.cssSelector("button#confirm"));
        confirmButton.click();

        //Switch to alert
        Alert confirmAlert = driver.switchTo().alert();

        //Get the text on alert
        System.out.println("Text on confirmation alert is: " +confirmAlert.getText());

        //Click on ok button
        confirmAlert.accept();

        //click on confirm alert button again and close the alert with cancel button.
        confirmButton.click();
        confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();

        driver.close();

    }
}

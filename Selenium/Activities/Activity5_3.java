package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-controls");

        //Find Text field and check if it is enabled
        WebElement textField = driver.findElement(By.id("input-text"));
        System.out.println("Text field is enabled: " +textField.isEnabled());
        //Find and click the Enable input button
        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
        //Check Text field is enabled
        System.out.println("Text field is enabled: " +textField.isEnabled());

        //Close the browser
        driver.close();
    }
}

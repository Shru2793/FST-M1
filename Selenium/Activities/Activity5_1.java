package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args){
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("The Page Title is: " +driver.getTitle());

        //To find Checkbox input element
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The CheckBox input Element is Displayed: " +checkBox.isDisplayed());

        //Click Remove checkbox
        WebElement removeCheckbox = driver.findElement(By.id("toggleCheckbox"));
        removeCheckbox.click();
        System.out.println("The CheckBox input Element is Displayed: " +checkBox.isDisplayed());
    //close the browser
        driver.close();
    }
}

package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title is: " +driver.getTitle());

        //FindCheckbox input Element
        WebElement checkBox = driver.findElement(By.cssSelector("input.willDisappear"));
        System.out.println("Checkbox is selected: " +checkBox.isSelected());

        //Click the Checkbox and check the is selected
        checkBox.click();
        System.out.println("Checkbox is selected: " +checkBox.isSelected());
        //Close the browser
        driver.close();


    }
}

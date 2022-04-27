package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Find check box and toggle button
        WebElement checkBox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        WebElement toggleButton= driver.findElement(By.id("toggleCheckbox"));

        //Click on toggle button
        toggleButton.click();

        //wait until checkbox is disappeared
        wait.until(ExpectedConditions.invisibilityOf(checkBox));

        //Click on toggle button again
        toggleButton.click();

        //Wait until check box is visible
        wait.until(ExpectedConditions.visibilityOf(checkBox));

        //Click checkbox
        checkBox.click();

        //Close the browser
        driver.close();


    }
}

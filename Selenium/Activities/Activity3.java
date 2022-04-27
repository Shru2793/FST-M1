package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("The Page title is: " + driver.getTitle());

        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.sendKeys("Shruthi");
        lastName.sendKeys("Vangala");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("vangala21@gmail.com");
        driver.findElement(By.id("number")).sendKeys("7022161819");
        driver.findElement(By.cssSelector("input.ui.green.button")).click();
        //driver.close();
    }
}

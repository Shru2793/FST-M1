package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Page Title is: " +driver.getTitle());

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Shruthi");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Nimma");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vangala@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9000364697");
        driver.findElement(By.xpath("//textarea")).sendKeys("Testing Form");
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();




    }
}

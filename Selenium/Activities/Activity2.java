package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");
    String title= driver.getTitle();
        System.out.println("The Title is: " + title);

        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("Text in Element1: " + idLocator.getText());

        WebElement classnameLocator = driver.findElement(By.className("green"));
        System.out.println("Text in Element2: " +classnameLocator.getText());

        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in Element3: " +cssLocator.getText());

        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in Element4: " +linkTextLocator.getText());

driver.close();

    }
}

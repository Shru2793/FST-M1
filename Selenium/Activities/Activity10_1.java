package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of the page is: " +driver.getTitle());

        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

        //Left Click
        actions.click(cube);
        WebElement cubeValue = driver.findElement(By.className("active"));
        System.out.println("Left click: " +cubeValue.getText());

        //DoubleClick
        actions.doubleClick(cube).perform();
        cubeValue =driver.findElement(By.className("active"));
        System.out.println("Double Click: " +cubeValue.getText());

        //rightclick
        actions.contextClick(cube).perform();
        cubeValue =driver.findElement(By.className("active"));
        System.out.println("Right click: " +cubeValue.getText());

        //close the browser
        driver.close();
    }
}

package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium/tab-opener");

        System.out.println("Page Title is: " +driver.getTitle());

        //Get handle name
        String parentHandle = driver.getWindowHandle();
        System.out.println("parent handle is: "+parentHandle);

        //find the new tab link and click it
        driver.findElement(By.id("launcher")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //print all handles
        Set<String> allWindowHandles= driver.getWindowHandles();
        System.out.println("All window handles are: " +allWindowHandles);

        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        //handle of current window
        System.out.println("Handle of 2nd window: " +driver.getWindowHandle());

        //new tab title
        System.out.println("Title of 2nd tab: " +driver.getTitle());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div.content"),"New Tab"));

        //Heading of 2nd window
        WebElement secondHeading = driver.findElement(By.cssSelector("div.content"));
        System.out.println("2nd Heading is: " +secondHeading.getText());

        //find the link to open another tab
        driver.findElement(By.linkText("Open Another One!")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles are: " +allWindowHandles);

        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        System.out.println("The title of 3rd tab is: " +driver.getTitle());

        System.out.println("the handle of 3rd tab is: "+driver.getWindowHandle());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div.content"),"New Tab"));

        //Heading of 3rd tab
        WebElement thirdHeading = driver.findElement(By.cssSelector("div.content"));
        System.out.println("third Header is: " +thirdHeading.getText());


        driver.quit();


    }
}

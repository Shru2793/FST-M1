package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/popups");

        //find the sign in button
        WebElement button = driver.findElement(By.xpath("//button[contains(@class,'orange')]"));
        //hover over
        action.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = button.getAttribute("data-tooltip");
        System.out.println("The tooltip text is: "+tooltipText);

        //Click on Sign in button
        button.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));

        //find the elements and enter keys
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //Get the message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);

        driver.quit();


    }
}

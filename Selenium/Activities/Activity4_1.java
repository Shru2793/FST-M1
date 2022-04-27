package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        //String title = driver.getTitle();
        System.out.println("The title is: " +driver.getTitle());
        WebElement page2 = driver.findElement(By.xpath("/html/body/div/div/div/a"));
        page2.click();
        System.out.println(" Page2 Title is: " +driver.getTitle());
        driver.close();
    }
}

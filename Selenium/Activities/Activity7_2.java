package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        //Find the input fields and enter the data
        driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("Shru");
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("passw");
        driver.findElement(By.xpath("//label[text() ='Confirm Password']/following :: input")).sendKeys("passw");
        driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following :: input")).sendKeys("test123@gmail.com");

        //Click on Signup button
        driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();

        //Confirmation message
        String ConfMsg= driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("The Confirmation message is: " +ConfMsg);

        driver.close();




    }
}

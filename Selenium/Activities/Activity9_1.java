package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");

        WebElement chosen = driver.findElement(By.id("single-value"));
        Select dropDown = new Select(driver.findElement(By.id("single-select")));

        //Selecting 2nd option
        dropDown.selectByVisibleText("Option 2");
        System.out.println("The 2nd Option is: " +chosen.getText());

        //Select 3rd option
        dropDown.selectByIndex(3);
        System.out.println("The Third option is: " +chosen.getText());

        //Select 4th option
        dropDown.selectByValue("4");
        System.out.println("The Fourth option is: " +chosen.getText());

        //get all options
       List<WebElement> allOptions = dropDown.getOptions();
       for (WebElement option : allOptions){
           System.out.println("Option " +option.getText());
       }
        //close browser
        driver.close();



    }
}

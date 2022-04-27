package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2{
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");

        WebElement chosen = driver.findElement(By.id("multi-value"));
        Select multiList = new Select(driver.findElement(By.id("multi-select")));

        if(multiList.isMultiple()){

            multiList.selectByVisibleText("Javascript");
            System.out.println("The option is: "+chosen.getText());

            multiList.selectByValue("node");
            System.out.println("The option is: " +chosen.getText());
            //Select 4th, 5th and 6th option by index
            for(int i =4; i<=6; i++){
                multiList.selectByIndex(i);
            }
            System.out.println("options are: " +chosen.getText());

            //Deselect NodeJS
            multiList.deselectByValue("node");
            System.out.println("Options are: "+chosen.getText());

            //Deselect 7th option
            multiList.deselectByIndex(6);
            System.out.println("Options are: " +chosen.getText());

            //First selected option
            WebElement firstOption = multiList.getFirstSelectedOption();
            System.out.println("First selected option is: " +firstOption.getText());

            //Get all selected options

            List<WebElement> allSelected = multiList.getAllSelectedOptions();

            for(WebElement selected : allSelected){
                System.out.println("selected " +selected.getText());
            }
            //Delete all options
            multiList.deselectAll();
            System.out.println(chosen.getText());
        }
        driver.close();
    }
}

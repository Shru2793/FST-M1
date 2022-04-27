package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        //Number of rows and columns
       List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
       List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("No of columns are: " +columns.size());
        System.out.println("no.of rows are: "+rows.size());
        //Third row values
       List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        for (WebElement cellValue : thirdRow){
            System.out.println("Cell Value: " +cellValue.getText());
        }

        WebElement cellValue2_2= driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("The second row second column value is : " +cellValue2_2.getText());

        driver.close();
    }
}

package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'sortable')]/tbody/tr[1]/td"));
        System.out.println("Number of Columns are: "+cols.size());
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'sortable')]/tbody/tr"));
        System.out.println("Number of rows are: "+rows.size());

        WebElement cellvalue2_before = driver.findElement(By.xpath("//table[contains(@class, 'sortable')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row second column value Before sorting is: " +cellvalue2_before.getText());

        //Sort the table
        driver.findElement(By.xpath("//table[@id = 'sortableTable']/thead/tr/th[1]")).click();

        //Celle value after sorting

        WebElement cellvalue2_after = driver.findElement(By.xpath("//table[contains(@class, 'sortable')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value after sorting is: "+cellvalue2_after.getText());

        List<WebElement> footerValues = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        for (WebElement cellValue : footerValues){
            System.out.println("footer values are : " +cellValue.getText());
        }

    }
}

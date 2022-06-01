package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Activity1Project {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Appium_Mobile");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", "true");

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
    }
    @Test
    public void googleTask1Test() {
        driver.findElementByAccessibilityId("Create new task").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@text='New task']")));


        MobileElement task1 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
        task1.sendKeys("Complete Activity with Google Tasks");

        driver.findElementById("add_task_done").click();
    }
    @Test
    public void googleTask2() {
            wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Create new task")));
            driver.findElementByAccessibilityId("Create new task").click();
            wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@text='New task']")));


            MobileElement task1 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
            task1.sendKeys("Complete Activity with Google Keep");

            driver.findElementById("add_task_done").click();

        }
        @Test
        public void googleTask3(){
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Create new task")));
        driver.findElementByAccessibilityId("Create new task").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@text='New task']")));


        MobileElement task1 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
        task1.sendKeys("Complete the second Activity Google Keep");

        driver.findElementById("add_task_done").click();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(MobileBy.id("com.google.android.apps.tasks:id/task_name")));

        List<MobileElement> tasksAdded = driver.findElementsById("com.google.android.apps.tasks:id/task_name");
        for(MobileElement task : tasksAdded){
            System.out.println("taskAdded: " +task.getText());
        }
        Assert.assertEquals(tasksAdded.size(),3);
    }
    @AfterClass
    public void afterClass(){
        //driver.quit();
    }
}

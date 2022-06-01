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
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2Project {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Appium_Mobile");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", "true");

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
    }
    @Test
    public void googleKeepTest(){
        driver.findElementByAccessibilityId("New text note").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("editable_title")));

        driver.findElementById("editable_title").sendKeys("Appium Testing");

        driver.findElementById("edit_note_text").sendKeys("GoogleKeep");

        driver.findElementByAccessibilityId("Navigate up").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("browse_note_interior_content")));

        String notesAdded= driver.findElementById("index_note_title").getText();
        Assert.assertEquals(notesAdded,"Appium Testing");
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}

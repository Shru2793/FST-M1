package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity4 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Appium_Mobile");
        caps.setCapability("platformName","android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage","com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset","true");

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
    }
    @Test
    public void addContactTest(){
        driver.findElementByAccessibilityId("Create new contact").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@text='First name']")));

        driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Aaditya");

        driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("Varma");

        driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("999148292");

        driver.findElementById("editor_menu_save_button").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));

        MobileElement contactCard = driver.findElementById("toolbar_parent");
        Assert.assertTrue(contactCard.isDisplayed());

        String contactName = driver.findElementById("large_title").getText();

      Assert.assertEquals(contactName, "Aaditya Varma");
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}

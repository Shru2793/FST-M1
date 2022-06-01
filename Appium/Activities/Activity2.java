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

public class Activity2 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Appium_Mobile");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", "true");

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void act2Test() {
        driver.get("https://www.training-support.net/");
        //Wait for about us page
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[contains(@text, 'About Us')]")));

        String Heading1 = driver.findElementByXPath("//android.view.View[@text = 'Training Support']").getText();
        System.out.println("Heading 1 is: " +Heading1);
        Assert.assertEquals(Heading1, "Training Support");

        MobileElement aboutUs = driver.findElement(MobileBy.xpath("//android.view.View[contains(@text, 'About Us')]"));

        aboutUs.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[contains(@text, 'About Us')]")));
        String Heading2 = driver.findElementByXPath("//android.view.View[contains(@text, 'About Us')]").getText();
        System.out.println("Heading 2 is: " +Heading2);
        Assert.assertEquals(Heading2, "About Us");
    }
        @AfterClass
        public void tearDown() {
            //driver.quit();
        }

    }


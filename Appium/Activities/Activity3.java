package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Appium_Mobile");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset","true");

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver= new AndroidDriver<>(appServer, caps);
    }
    @Test
    public void addTest(){
        driver.findElementById("digit_5").click();

        driver.findElementByAccessibilityId("plus").click();

        driver.findElementById("digit_9").click();

        driver.findElementByAccessibilityId("equals").click();

        String result = driver.findElementById("result").getText();
        System.out.println("Add Result is: " +result);
        Assert.assertEquals(result, "14");
    }
    @Test
    public void subtractTest(){
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();

        driver.findElementByAccessibilityId("minus").click();

        driver.findElementById("digit_5").click();

        driver.findElementByAccessibilityId("equals").click();

        String result = driver.findElementById("result").getText();
        System.out.println("Subtraction Result is: " +result);
        Assert.assertEquals(result, "5");
    }
    @Test
    public void multiplyTest(){
        driver.findElementById("digit_5").click();

        driver.findElementByAccessibilityId("multiply").click();

        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("digit_0").click();

        driver.findElementByAccessibilityId("equals").click();

        String result = driver.findElementById("result").getText();
        System.out.println("Multiplication Result is: " +result);
        Assert.assertEquals(result, "500");
    }
    @Test
    public void divideTest(){
        driver.findElementById("digit_5").click();
        driver.findElementById("digit_0").click();

        driver.findElementByAccessibilityId("divide").click();

        driver.findElementById("digit_2").click();

        driver.findElementByAccessibilityId("equals").click();

        String result = driver.findElementById("result").getText();
        System.out.println("Divide Result is: " +result);
        Assert.assertEquals(result, "25");
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }



}

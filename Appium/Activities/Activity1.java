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

public class Activity1 {
    //Declare android driver
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Set Capabilities
     DesiredCapabilities caps = new DesiredCapabilities();
     caps.setCapability("deviceName","Appium_Mobile");
     caps.setCapability("platformName","Android");
     caps.setCapability("automationName","UiAutomator2");
     caps.setCapability("appPackage","com.android.calculator2");
     caps.setCapability("appActivity",".Calculator");
     caps.setCapability("noReset", "true");

     //Instantiate appium driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void multiply(){

        driver.findElementById("com.android.calculator2:id/digit_5").click();

        driver.findElementByAccessibilityId("multiply").click();

        driver.findElementByXPath("//android.widget.Button[@text = '6']").click();

        driver.findElementById("eq").click();

        String result = driver.findElementById("result").getText();
        System.out.println("Result is: "+result);

        Assert.assertEquals(result, "30");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}

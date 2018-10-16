
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

    public class s {
        public static AppiumDriver<MobileElement> driver;
        public static WebDriverWait wait;


    static {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "iPhone 6");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("automationName", "XCUITest");
        File app = new File("/Users/akoval/Downloads/Encyclopedia.app");
        caps.setCapability("app", app);
        caps.setCapability("automationName", "XCUITest");
        try {
            driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        wait = new WebDriverWait(driver, 10);
    }

    @Test
            (description = "Create new empty list")
    public void test1() {
        System.out.println(1);

    }
}








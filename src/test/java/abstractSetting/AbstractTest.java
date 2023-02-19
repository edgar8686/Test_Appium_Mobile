package abstractSetting;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTest {
    private static AndroidDriver androidDriver;

    @BeforeAll
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "12");
        dc.setCapability("deviceName", "emulator-5554");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        dc.setCapability("app", "C:\\Users\\edgar\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\xml\\Crypto Academy.apk");
        // dc.setCapability("udid", "5554");
        //dc.setCapability("autoWebviewTimeout", "15000");
        //dc.setCapability("systemPort", "8100");
        //dc.setCapability("chromedriverPort", "8101");
        //dc.setCapability("mjpegServerPort", "8102");
        dc.setCapability("isHeadless", "true");


        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);

       /* DesiredCapabilities dc = new DesiredCapabilities();
        dm.setCapability("platformName", "Android");
        dm.setCapability("platformVersion", "12");
        dm.setCapability("deviceName", "emulator-5556");
        dm.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        dm.setCapability("udid", "5556");
        dm.setCapability("app", "C:\\Users\\edgar\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\xml\\Crypto Academy.apk");
        //dm.setCapability("autoWebviewTimeout", "15000");
        dm.setCapability("systemPort", "8200");
        dm.setCapability("chromedriverPort", "8201");
        dm.setCapability("mjpegServerPort", "8202");
        // dm.setCapability("isHeadless", "true");


        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dm);

        */

        WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(30));
    }

    @AfterEach
    public void closeWeb() {
        List<String> windowHandles = new ArrayList<>(getAndroidDriver().getWindowHandles());
        androidDriver.manage().deleteAllCookies();
        if (windowHandles.size() > 1 && androidDriver != null) {
            for (int i = 0; i < windowHandles.size(); i++) {
                androidDriver.switchTo().window(windowHandles.get(i)).close();
            }
        } else if (androidDriver != null) {
            androidDriver.close();
        }
    }

    @AfterAll
    public static void quite() {
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }

    public static AndroidDriver getAndroidDriver() {
        return androidDriver;
    }
}

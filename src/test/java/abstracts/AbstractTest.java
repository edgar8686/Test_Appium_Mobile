package abstracts;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class AbstractTest {
    private static AndroidDriver androidDriver;

    @BeforeAll
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "12");
        dc.setCapability("deviceName", "sdk_gphone64_x86_64");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        dc.setCapability("app", "C:\\Users\\edgar\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\xml\\Crypto Academy.apk");
        dc.setCapability("chromedriverDisableBuildCheck", "true");
        dc.setCapability("autoWebviewTimeout", "10000");
        dc.setCapability("isHeadless", "true");
        // dc.setCapability(MobileCapabilityType.NO_RESET, "true");
        // dc.setCapability(MobileCapabilityType.FULL_RESET,"false");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
    }

    @AfterEach
    public void closeWeb() {
        androidDriver.manage().deleteAllCookies();
        if (androidDriver != null) {
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

package org.example;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "android");
        dc.setCapability("platformVersion", "11");
        dc.setCapability("deviceName", "emulator-5556");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        dc.setCapability("app", "C:\\Users\\edgar\\AndroidStudioProjects\\MyApplication\\app\\src\\main\\res\\xml\\Crypto Academy.apk");

        AppiumDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);

    }
}
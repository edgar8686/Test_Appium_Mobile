package org.example.helpClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.example.abstractClass.AbstractPageObject;

public class GoTo extends AbstractPageObject {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private static MobileElement exit;
    @AndroidFindBy(accessibility = "Articles\n" +
            "Tab 2 of 4")
    private static MobileElement articles;
    @AndroidFindBy(accessibility = "Glossary\n" +
            "Tab 3 of 4")
    private static MobileElement glossary;


    public GoTo(AndroidDriver driver) {
        super(driver);
    }
    public void goToArticles() throws Exception {
        exit.click();
        Thread.sleep(2000);
        articles.click();
        Thread.sleep(2000);
    }
    public void goToGlossary() throws Exception {
        exit.click();
        Thread.sleep(2000);
        glossary.click();
        Thread.sleep(2000);
    }
}

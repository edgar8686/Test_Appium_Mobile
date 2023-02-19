package articlesTests.croPricePrediction;

import abstractSetting.AbstractTest;
import io.qameta.allure.*;
import org.example.pageElements.ArticlesElements;
import org.example.utils.MyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.file.Files;

public class AnnouncedLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(AnnouncedLinkTest.class);

    @Epic("Articles")
    @Feature("CRO price prediction: Will the Crypto.com token rebound?")
    @DisplayName("Test№13")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void announcedLinkTest() throws Exception {
        try {
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapCroPrice();
            tapElement.tapAnnounced();
            getAndroidDriver().context("WEBVIEW_chrome");
            getAndroidDriver().getWindowHandle();
            Assertions.assertTrue(getAndroidDriver().getTitle().equals("Revised Changes to Crypto.com Visa Cards Update"));
            Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://crypto.com/product-news/crypto-com-visa-cards-update"));
        } catch (AssertionFailedError a) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Amazon stock forecast for 2022) AmazonShareValueLinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("(Amazon stock forecast for 2022) AnnouncedLinkTest- false");
        }
        logger.info("(CRO price prediction) AnnouncedLinkTest- passed");
    }
}

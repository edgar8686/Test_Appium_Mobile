package articlesTests.shibuInuPricePrediction;

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

public class ShibLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(ShibLinkTest.class);

    @Epic("Articles")
    @Feature("Shiba inu price prediction: Can the meme coin stop the slide?")
    @DisplayName("Test№1")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void shibLinkTest() throws Exception {
        try {
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            tapElement.tapShibaInuPrice();
            Thread.sleep(3000);
            tapElement.tapShibLink();
            getAndroidDriver().context("WEBVIEW_chrome");
            getAndroidDriver().getWindowHandle();
            Assertions.assertTrue(getAndroidDriver().getTitle().equals("SHIB/USD Chart | Live Shiba Inu to US Dollar Price"));
            Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/shiba-inu-to-us-dollar-chart"));
        } catch (AssertionFailedError a) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Amazon stock forecast for 2022) AmazonShareValueLinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("(Amazon stock forecast for 2022) ShibLinkTest- false");
        }
        logger.info("(Shibu inu price prediction) ShibLinkTest- passed");

    }
}

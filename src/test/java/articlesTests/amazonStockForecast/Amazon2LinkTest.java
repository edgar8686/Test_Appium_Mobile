package articlesTests.amazonStockForecast;

import abstractSetting.AbstractTest;
import io.github.artsok.RepeatedIfExceptionsTest;
import io.qameta.allure.*;
import org.example.helpClass.GoTo;
import org.example.pageElements.AmazonStockForecastElements;
import org.example.utils.MyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Amazon2LinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(Amazon2LinkTest.class);

    @Epic("Articles")
    @Feature("Amazon stock forecast for 2022: Should you buy the dip?")
    @DisplayName("Test№18")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @RepeatedIfExceptionsTest(repeats = 1, exceptions = Exception.class)
    @Test
    void amazon2LinkTest() throws IOException {
        try {
            AmazonStockForecastElements tapElement = new AmazonStockForecastElements(getAndroidDriver());
            new GoTo(getAndroidDriver())
                    .goToArticles();
            Thread.sleep(2000);
            tapElement.tapAmazonStockForecast();
            Thread.sleep(3000);
            tapElement.tapAmazon2();
            getAndroidDriver().context("WEBVIEW_chrome");
            getAndroidDriver().getWindowHandle();
            Assertions.assertTrue(getAndroidDriver().getTitle().equals("Amazon.com Inc (AMZN) Stock Price & Chart | Trade Now"));
            Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/amazon-share-price"));
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Amazon stock forecast for 2022) Amazon2LinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("org.example.articlesTests (Amazon stock forecast for 2022) Amazon2LinkTest- False");
        } catch (AssertionFailedError a) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Amazon stock forecast for 2022) AmazonShareValueLinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("(Amazon stock forecast for 2022) Amazon2LinkTest- false");
        }
        logger.info("(Amazon stock forecast for 2022) Amazon2LinkTest- passed");
    }
}

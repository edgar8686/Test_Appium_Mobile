package articlesTests.amazonStockForecast;

import abstractSetting.AbstractTest;
import io.qameta.allure.Link;
import org.example.helpClass.GoTo;
import org.example.pageElements.AmazonStockForecastElements;
import org.example.utils.MyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class AnnouncingLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(AnnouncingLinkTest.class);

    @Test
    @DisplayName("Tect№2: Articles - Amazon stock forecast for 2022")
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    void announcingLinkTest() throws IOException {
        try {
            AmazonStockForecastElements tapElement = new AmazonStockForecastElements(getAndroidDriver());
            GoTo goTo = new GoTo(getAndroidDriver());
            goTo.goToArticles();
            Thread.sleep(2000);
            tapElement.tapAmazonStockForecast();
            Thread.sleep(3000);
            tapElement.tapAnnouncing();
            getAndroidDriver().context("WEBVIEW_chrome");
            getAndroidDriver().getWindowHandle();
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Amazon stock forecast for 2022) AnnouncingLinkTest- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
            logger.error("org.example.articlesTests (Amazon stock forecast for 2022) AnnouncingLinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("Amazon.com, Inc. - Amazon.com Announces First Quarter Results"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://ir.aboutamazon.com/news-release/news-release-details/2022/Amazon.com-Announces-First-Quarter-Results-f0188db95/default.aspx"));
        logger.info("(Amazon stock forecast for 2022) AnnouncingLinkTest- passed");
    }
}

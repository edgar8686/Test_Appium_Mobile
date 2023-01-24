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

public class RivnLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(RivnLinkTest.class);

    @Test
    @DisplayName("Tect№3: Articles - Amazon stock forecast for 2022")
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    void rivnLinkTest() throws IOException {
        try {
            AmazonStockForecastElements tapElement = new AmazonStockForecastElements(getAndroidDriver());
            GoTo goTo = new GoTo(getAndroidDriver());
            goTo.goToArticles();
            Thread.sleep(2000);
            tapElement.tapAmazonStockForecast();
            System.out.println(getAndroidDriver().manage().window().getSize());
            Thread.sleep(3000);
            tapElement.tapRivn();
            getAndroidDriver().context("WEBVIEW_chrome");
            getAndroidDriver().getWindowHandle();
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Amazon stock forecast for 2022) RivnLinkTest- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
            logger.error("org.example.articlesTests (Amazon stock forecast for 2022) RivnLinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("Rivian Automotive, Inc. / DE (RIVN) Stock Price & Chart | Trade Now"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/rivian-automotive-inc-de-share-price"));
        logger.info("(Amazon stock forecast for 2022) RivnLinkTest- passed");
    }
}

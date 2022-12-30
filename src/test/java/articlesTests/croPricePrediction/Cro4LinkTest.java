package articlesTests.croPricePrediction;

import abstracts.AbstractTest;
import io.qameta.allure.Link;
import org.example.pageElement.ArticlesElements;
import org.example.utils.MyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Cro4LinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(Cro4LinkTest.class);

    @Test
    @DisplayName("Tect№12: Articles - CRO price prediction")
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    void cro4LinkTest() throws IOException {
        try {
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapCroPrice();
            tapElement.tapCro4();
            Thread.sleep(15000);
            getAndroidDriver().context("WEBVIEW_chrome");
            Thread.sleep(4000);
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (CRO price prediction) Cro4LinkTest- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
            logger.error("org.example.articlesTests (CRO price prediction) Cro4LinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("CRO/USD Chart | Live Crypto.com Coin to US Dollar Price"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/crypto-com-coin-to-us-dollar-chart"));
        logger.info("(CRO price prediction) Cro4LinkTest- passed");
    }
}

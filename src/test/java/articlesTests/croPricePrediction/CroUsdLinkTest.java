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

public class CroUsdLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(CroUsdLinkTest.class);

    @Test
    @DisplayName("Tect№19: Articles - CRO price prediction")
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    void croUsdLinkTest() throws IOException {
        try {
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapCroPrice();
            tapElement.tapCroUsd();
            Thread.sleep(5000);
            getAndroidDriver().context("WEBVIEW_chrome");
            Thread.sleep(3000);
            System.out.println(getAndroidDriver().getTitle());
            System.out.println(getAndroidDriver().getCurrentUrl());
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (CRO price prediction) CroUsdLinkTest- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
            logger.error("org.example.articlesTests (CRO price prediction) CroUsdLinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("CRO/USD Chart | Live Crypto.com Coin to US Dollar Price"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/crypto-com-coin-to-us-dollar-chart"));
        logger.info("(CRO price prediction) CroUsdLinkTest- passed");
    }
}

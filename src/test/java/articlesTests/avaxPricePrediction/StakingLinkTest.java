package articlesTests.avaxPricePrediction;

import abstractSetting.AbstractTest;
import io.qameta.allure.*;
import org.example.pageElements.AvaxPricePredictionElements;
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

public class StakingLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(StakingLinkTest.class);

    @Epic("Articles")
    @Feature("Avax price prediction: Will Avalanche fall further?")
    @DisplayName("Test№13")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void stakingLinkTest() throws Exception {
        try {
            AvaxPricePredictionElements tapElement = new AvaxPricePredictionElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapAvaxPricePrediction();
            Thread.sleep(3000);
            tapElement.tapStaking();
            getAndroidDriver().context("WEBVIEW_chrome");
            getAndroidDriver().getWindowHandle();
            Assertions.assertTrue(getAndroidDriver().getTitle().equals("What is Staking | Definition and Meaning | Capital.com"));
            Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/staking-definition"));
        } catch (AssertionFailedError a) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Amazon stock forecast for 2022) AmazonShareValueLinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("(Amazon stock forecast for 2022) StakingLinkTest- false");
        }
        logger.info("(AVAX price prediction) StakingLinkTest- passed");
    }
}

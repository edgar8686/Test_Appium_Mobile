package articlesTests.ripplPricePrediction;

import abstractSetting.AbstractTest;
import io.qameta.allure.*;
import org.example.helpClass.GoTo;
import org.example.pageElements.RipplePricePredictionElements;
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

public class FirstQuarterUpdate extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(FirstQuarterUpdate.class);

    @Epic("Articles")
    @Feature("Ripple price prediction 2022-2025: Will XRP hit $1?")
    @DisplayName("Test№15")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void firstQuarterUpdate() throws Exception {
        try {
            RipplePricePredictionElements tapElement = new RipplePricePredictionElements(getAndroidDriver());
            new GoTo(getAndroidDriver())
                    .goToArticles();
            Thread.sleep(2000);
            tapElement.tapRipplePricePrediction();
            Thread.sleep(3000);
            tapElement.tapFirstQuarterUpdate();
            getAndroidDriver().context("WEBVIEW_chrome");
            getAndroidDriver().getWindowHandle();
            Assertions.assertTrue(getAndroidDriver().getTitle().equals("Q1 2022 XRP Markets Report | Ripple"));
            Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://ripple.com/insights/q1-2022-xrp-markets-report/"));
        } catch (AssertionFailedError a) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Ripple price prediction 2022-2025) FirstQuarterUpdate- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("(Ripple price prediction 2022-2025) FirstQuarterUpdate- false");
        }
        logger.info("(Ripple price prediction 2022-2025) FirstQuarterUpdate- passed");
    }
}

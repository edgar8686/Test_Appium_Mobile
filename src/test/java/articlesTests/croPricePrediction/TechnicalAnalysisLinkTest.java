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

public class TechnicalAnalysisLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(TechnicalAnalysisLinkTest.class);

    @Test
    @DisplayName("Tect№9: Articles - CRO price prediction")
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    void technicalAnalysisLinkTest() throws IOException {
        try {
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapCroPrice();
            tapElement.tapTechnicalAnalysis();
            Thread.sleep(1000);
            getAndroidDriver().context("WEBVIEW_chrome");
            Thread.sleep(1000);
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (CRO price prediction) TechnicalAnalysisLinkTest- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
            logger.error("org.example.articlesTests (CRO price prediction) TechnicalAnalysisLinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("Technical Analysis: Definition and Meaning | Capital.com"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/technical-analysis-definition"));
        logger.info("(CRO price prediction) TechnicalAnalysisLinkTest- passed");
    }
}

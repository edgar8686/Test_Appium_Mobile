package articlesTests.shibuInuPricePrediction;

import abstractSetting.AbstractTest;
import io.qameta.allure.*;
import org.example.pageElements.ArticlesElements;
import org.example.utils.MyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ListedRobinhoodLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(ListedRobinhoodLinkTest.class);

    @Epic("Articles")
    @Feature("Shiba inu price prediction: Can the meme coin stop the slide?")
    @DisplayName("Test№2")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void listedRobinhoodLinkTest() throws IOException {
        try {
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapShibaInuPrice();
            Thread.sleep(3000);
            tapElement.tapListedRobinhoodLink();
            Thread.sleep(3000);
            getAndroidDriver().context("WEBVIEW_chrome");
            Thread.sleep(3000);
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Shibu inu price prediction)  listedRobinhoodLinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("org.example.articlesTests (Shibu inu price prediction) listedRobinhoodLinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("Under the Hood"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://blog.robinhood.com/"));
        logger.info("(Shibu inu price prediction) listedRobinhoodLinkTest- passed");
    }
}

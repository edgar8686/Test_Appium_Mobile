package articlesTests.shibuInuPricePrediction;

import abstracts.AbstractTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
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

public class DaoLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(DaoLinkTest.class);

    @Test
    @DisplayName("Tect№8: Articles - Shibu inu price prediction")
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    void daoLinkTest() throws IOException {
        try {
            TouchAction touchAction = new TouchAction(getAndroidDriver());
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapShibaInuPrice();
            Thread.sleep(3000);
            touchAction
                    .press(PointOption.point(620, 2200))
                    .moveTo(PointOption.point(620, 800))
                    .release()
                    .perform();
            touchAction
                    .press(PointOption.point(620, 2200))
                    .moveTo(PointOption.point(620, 800))
                    .release()
                    .perform();
            touchAction
                    .press(PointOption.point(620, 2200))
                    .moveTo(PointOption.point(620, 800))
                    .release()
                    .perform();
            tapElement.tapDao();
            Thread.sleep(5000);
            getAndroidDriver().context("WEBVIEW_chrome");
            Thread.sleep(3000);
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Shibu inu price prediction)  DAOLinkTest- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
            logger.error("org.example.articlesTests (Shibu inu price prediction) DAOLinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("Decentralised Autonomous Organisation (DAO) | Definition & Meaning | Capital.com"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/decentralised-autonomous-organisation-dao-definition"));
        logger.info("(Shibu inu price prediction) DAOLinkTest- passed");
    }
}

package articlesTests.croPricePrediction;

import abstractSetting.AbstractTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Link;
import org.example.pageElements.ArticlesElements;
import org.example.utils.MyUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class WhitepaperLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(WhitepaperLinkTest.class);

    @Test
    @DisplayName("Tect№6: Articles - CRO price prediction")
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    void whitepaperLinkTest() throws IOException {
        try {
            TouchAction touchAction = new TouchAction(getAndroidDriver());
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapCroPrice();
            Thread.sleep(4000);
            touchAction
                    .press(PointOption.point(620, 2400))
                    .moveTo(PointOption.point(620, 600))
                    .release()
                    .perform();
            touchAction
                    .press(PointOption.point(620, 2400))
                    .moveTo(PointOption.point(620, 600))
                    .release()
                    .perform();
            tapElement.tapWhitepaper();
            Thread.sleep(1000);
            getAndroidDriver().context("WEBVIEW_chrome");
            Thread.sleep(1000);
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (CRO price prediction) WhitepaperLinkTest- False" + System.currentTimeMillis() + ".png");
            MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()));
            logger.error("org.example.articlesTests (CRO price prediction) WhitepaperLinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("Crypto.com: The best place to buy Bitcoin, Ethereum, and 250+ altcoins"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://crypto.com/"));
        logger.info("(CRO price prediction) WhitepaperLinkTest- passed");
    }
}

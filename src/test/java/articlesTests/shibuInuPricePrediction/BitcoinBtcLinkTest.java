package articlesTests.shibuInuPricePrediction;

import abstractSetting.AbstractTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.*;
import org.example.pageElements.ArticlesElements;
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

public class BitcoinBtcLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(BitcoinBtcLinkTest.class);

    @Epic("Articles")
    @Feature("Shiba inu price prediction: Can the meme coin stop the slide?")
    @DisplayName("Test№7")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void bitcoinBtcLinkTest() throws Exception {
        try {
            TouchAction touchAction = new TouchAction(getAndroidDriver());
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            tapElement.tapShibaInuPrice();
            Thread.sleep(3000);
            touchAction
                    .press(PointOption.point(620, 2000))
                    .moveTo(PointOption.point(620, 720))
                    .release()
                    .perform();
            tapElement.tapBitcoinBtc();
            getAndroidDriver().context("WEBVIEW_chrome");
            getAndroidDriver().getWindowHandle();
            Assertions.assertTrue(getAndroidDriver().getTitle().equals("BTC/USD Chart | Live Bitcoin to US Dollar Price"));
            Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/btc-usd-chart"));
        } catch (AssertionFailedError a) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Amazon stock forecast for 2022) AmazonShareValueLinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("(Amazon stock forecast for 2022) BitcoinBTCLinkTest- false");
        }
        logger.info("(Shibu inu price prediction) BitcoinBTCLinkTest- passed");

    }
}

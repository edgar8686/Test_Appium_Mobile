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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class DogeLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(DogeLinkTest.class);

    @Epic("Articles")
    @Feature("Shiba inu price prediction: Can the meme coin stop the slide?")
    @DisplayName("Test№4")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void dogeLinkTest() throws IOException {
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
            tapElement.tapDoge();
            Thread.sleep(1000);
            getAndroidDriver().context("WEBVIEW_chrome");
            Thread.sleep(1000);
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Shibu inu price prediction) DogeLinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("(Shibu inu price prediction) DogeLinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("DOGE/USD Chart | Live DogeCoin to US Dollar Price"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/dogecoin-to-usd"));
        //getAndroidDriver().context("NATIVE_APP");
        logger.info("(Shibu inu price prediction) DogeLinkTest- passed");
    }
}

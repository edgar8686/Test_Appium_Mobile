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

public class Shib3LinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(Shib3LinkTest.class);

    @Epic("Articles")
    @Feature("Shiba inu price prediction: Can the meme coin stop the slide?")
    @DisplayName("Test№13")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void shib3LinkTest() throws IOException {
        try {
            TouchAction touchAction = new TouchAction(getAndroidDriver());
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapShibaInuPrice();
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
            touchAction
                    .press(PointOption.point(620, 2200))
                    .moveTo(PointOption.point(620, 600))
                    .release()
                    .perform();
            touchAction
                    .press(PointOption.point(620, 2200))
                    .moveTo(PointOption.point(620, 600))
                    .release()
                    .perform();
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

            tapElement.tapShib3();
            Thread.sleep(1000);
            getAndroidDriver().context("WEBVIEW_chrome");
            Thread.sleep(1000);
        } catch (Exception e) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Shibu inu price prediction)  Shib3LinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("org.example.articlesTests (Shibu inu price prediction) Shib3LinkTest- False");
        }
        Assertions.assertTrue(getAndroidDriver().getTitle().equals("SHIB/USD Chart | Live Shiba Inu to US Dollar Price"));
        Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/shiba-inu-to-us-dollar-chart"));
        logger.info("(Shibu inu price prediction) Shib3LinkTest- passed");
    }

}

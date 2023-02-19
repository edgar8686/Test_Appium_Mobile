package articlesTests.croPricePrediction;

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

public class NonFungibleTokenLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(NonFungibleTokenLinkTest.class);

    @Epic("Articles")
    @Feature("CRO price prediction: Will the Crypto.com token rebound?")
    @DisplayName("Test№5")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void nonFungibleTokenLinkTest() throws Exception {
        try {
            TouchAction touchAction = new TouchAction(getAndroidDriver());
            ArticlesElements tapElement = new ArticlesElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(3000);
            tapElement.tapCroPrice();
            Thread.sleep(3000);
            touchAction
                    .press(PointOption.point(620, 2400))
                    .moveTo(PointOption.point(620, 600))
                    .release()
                    .perform();

            tapElement.tapNonFungibleToken();
            getAndroidDriver().context("WEBVIEW_chrome");
            getAndroidDriver().getWindowHandle();
            Assertions.assertTrue(getAndroidDriver().getTitle().equals("Non-fungible token | What is NFT | Definition and meaning | Capital.com"));
            Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/non-fungible-tokens-nft-definition"));
        } catch (AssertionFailedError a) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Amazon stock forecast for 2022) AmazonShareValueLinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("(Amazon stock forecast for 2022) NonFungibleTokenLinkTest- false");
        }
        logger.info("(CRO price prediction) NonFungibleTokenLinkTest- passed");
    }
}

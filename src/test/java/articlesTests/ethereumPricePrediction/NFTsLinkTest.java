package articlesTests.ethereumPricePrediction;

import abstractSetting.AbstractTest;
import io.qameta.allure.*;
import org.example.pageElements.EthereumPricePredictionElements;
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

public class NFTsLinkTest extends AbstractTest {
    static Logger logger = LoggerFactory.getLogger(NFTsLinkTest.class);

    @Epic("Articles")
    @Feature("Ethetium price precondition for 2022 and beyond: Will ETH ever hit $10,000?")
    @DisplayName("Test№14")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://docs.google.com/spreadsheets/d/1cz-FGYsjfpLtaogip9UvuRrUE50nLWkGCkXN2xP-6fE/edit?usp=sharing")
    @Test
    void nftsLinkTest() throws Exception {
        try {
            EthereumPricePredictionElements tapElement = new EthereumPricePredictionElements(getAndroidDriver());
            tapElement.goToArticles();
            Thread.sleep(2000);
            tapElement.tapEthereumPricePrediction();
            Thread.sleep(3000);
            tapElement.tapNFTs();
            getAndroidDriver().context("WEBVIEW_chrome");
            getAndroidDriver().getWindowHandle();
            Assertions.assertTrue(getAndroidDriver().getTitle().equals("[Guide] What are NFTs: everything you need to know about non-fungible tokens"));
            Assertions.assertTrue(getAndroidDriver().getCurrentUrl().equals("https://capital.com/what-are-nfts-everything-you-need-to-know-about-non-fungible-tokens"));
        } catch (AssertionFailedError a) {
            File file = MyUtils.makeScreenshot(getAndroidDriver(), "failure- org.example.articlesTests (Amazon stock forecast for 2022) AmazonShareValueLinkTest- False" + System.currentTimeMillis() + ".png");
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(MyUtils.saveScreenshot(Files.readAllBytes(file.toPath()))));
            logger.error("(Amazon stock forecast for 2022) NFTsLinkTest- false");
        }
        logger.info("(Ethereum price prediction) NFTsLinkTest- passed");
    }
}

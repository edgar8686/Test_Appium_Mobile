package org.example.pageElements;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.example.abstractClass.AbstractPageObject;
import org.example.helpClass.Swipe;
import org.example.myEnum.Side;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class RipplePricePredictionElements extends AbstractPageObject {
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Ripple price prediction 2022-2025: Will XRP hit $1?\n" +
            "crypto\n" +
            "May 10, 2022  16:28\"]")
    private WebElement ripplePricePrediction;
    @AndroidFindBy(accessibility = "XRP")
    private WebElement xrp;
    @AndroidFindBy(accessibility = "SEC")
    private WebElement sec;
    @AndroidFindBy(accessibility = "XRP price")
    private WebElement xrpPrice;
    @AndroidFindBy(accessibility = "cryptocurrency markets")
    private WebElement cryptocurrencyMarkets;
    @AndroidFindBy(accessibility = "first-quarter update")
    private WebElement firstQuarterUpdate;
    @AndroidFindBy(accessibility = "XRP coin")
    private WebElement xrpCoin;
    @AndroidFindBy(accessibility = "NFTs")
    private WebElement NFTs;
    @AndroidFindBy(accessibility = "XRP chart")
    private WebElement xrpChart;
    @AndroidFindBy(accessibility = "trading XRP")
    private WebElement tradingXRP;
    @AndroidFindBy(accessibility = "trading XRP")
    private WebElement tradingXrp;

    public RipplePricePredictionElements(AndroidDriver driver) {
        super(driver);
    }

    public RipplePricePredictionElements tapRipplePricePrediction() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2100))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(620, 200))
                .release()
                .perform();
        ripplePricePrediction.click();
        return this;
    }

    public RipplePricePredictionElements tapXrp() {
        xrp.click();
        return this;
    }

    public RipplePricePredictionElements tapSec() {
        sec.click();
        return this;
    }

    public RipplePricePredictionElements tapXrpPrice() {
        new Swipe(getAndroidDriver())
                .swipeScreen(Side.UP_SHORT);
        xrpPrice.click();
        return this;
    }

    public RipplePricePredictionElements tapCryptocurrencyMarkets() {
        new Swipe(getAndroidDriver())
                .swipeScreen(Side.UP_SHORT);
        cryptocurrencyMarkets.click();
        return this;
    }

    public RipplePricePredictionElements tapFirstQuarterUpdate() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        firstQuarterUpdate.click();
        return this;
    }

    public RipplePricePredictionElements tapXrpCoin() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_SHORT);
        swipe.swipeScreen(Side.UP_SHORT);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        xrpCoin.click();
        return this;
    }

    public RipplePricePredictionElements tapNFTs() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_SHORT);
        swipe.swipeScreen(Side.UP_SHORT);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        NFTs.click();
        return this;
    }

    public RipplePricePredictionElements tapXrpChart() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_SHORT);
        swipe.swipeScreen(Side.UP_SHORT);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        xrpChart.click();
        return this;
    }

    public RipplePricePredictionElements tapXrpPrice2() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_SHORT);
        swipe.swipeScreen(Side.UP_SHORT);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        xrpPrice.click();
        return this;
    }

    public RipplePricePredictionElements tapTradingXRP() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_SHORT);
        swipe.swipeScreen(Side.UP_SHORT);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        tradingXRP.click();
        return this;
    }

    public RipplePricePredictionElements tapXrp2() {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        xrp.click();
        return this;
    }

    public RipplePricePredictionElements tapXrpPrice3() {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        xrpPrice.click();
        return this;
    }
}

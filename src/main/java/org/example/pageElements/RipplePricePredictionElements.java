package org.example.pageElements;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.example.abstractClass.AbstractPageObject;
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
                .press(PointOption.point(620, 2000))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(620, 600))
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
        xrpPrice.click();
        return this;
    }
    public RipplePricePredictionElements tapCryptocurrencyMarkets() {
        cryptocurrencyMarkets.click();
        return this;
    }
    public RipplePricePredictionElements tapFirstQuarterUpdate() {
        firstQuarterUpdate.click();
        return this;
    }
    public RipplePricePredictionElements tapXrpCoin() {
        xrpCoin.click();
        return this;
    }
    public RipplePricePredictionElements tapNFTs() {
        NFTs.click();
        return this;
    }
    public RipplePricePredictionElements tapXrpChart() {
        xrpChart.click();
        return this;
    }
    public RipplePricePredictionElements tapXrpPrice2() {
        xrpPrice.click();
        return this;
    }
    public RipplePricePredictionElements tapTradingXRP() {
        tradingXRP.click();
        return this;
    }
    public RipplePricePredictionElements tapXrp2() {
        xrp.click();
        return this;
    }
    public RipplePricePredictionElements tapXrpPrice3() {
        xrpPrice.click();
        return this;
    }
}

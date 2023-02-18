package org.example.pageElements;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.example.abstractClass.AbstractPageObject;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class EthereumPricePredictionElements extends AbstractPageObject {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private WebElement exit;
    @AndroidFindBy(accessibility = "Articles\n" +
            "Tab 2 of 4")
    private WebElement articles;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Ethereum price prediction for 2022 and beyond: Will ETH ever hit $10,000?\n" +
            "crypto\n" +
            "May 12, 2022  15:09\"]")
    private WebElement etheriumPricePrediction;
    @AndroidFindBy(accessibility = "ETH")
    private WebElement etherium;
    @AndroidFindBy(accessibility = "blockchain")
    private WebElement blockchain;
    @AndroidFindBy(accessibility = "stablecoin")
    private WebElement stablecoin;
    @AndroidFindBy(accessibility = "liquidity pool")
    private WebElement liquidityPool;
    @AndroidFindBy(accessibility = "BTC")
    private WebElement btc;
    @AndroidFindBy(accessibility = "BT")
    private WebElement bt;
    @AndroidFindBy(accessibility = "flash crash")
    private WebElement flashCrash;
    @AndroidFindBy(accessibility = "Cryptocurrency markets")
    private WebElement cryptocurrencyMarkets;
    @AndroidFindBy(accessibility = "PoW")
    private WebElement pow;
    @AndroidFindBy(accessibility = "PoS")
    private WebElement pos;
    @AndroidFindBy(accessibility = "Ethereum 2.0 upgrade")
    private WebElement ethereumUpgrade;
    @AndroidFindBy(accessibility = "dApps")
    private WebElement dApps;
    @AndroidFindBy(accessibility = "DeFi")
    private WebElement deFi;
    @AndroidFindBy(accessibility = "NFTs")
    private WebElement nfts;
    @AndroidFindBy(accessibility = "DeFi Llama")
    private WebElement deFiLlama;
    @AndroidFindBy(accessibility = "sees the potential")
    private WebElement seesThePotential;
    @AndroidFindBy(accessibility = "bitcoins")
    private WebElement bitcoins;
    @AndroidFindBy(accessibility = "US500")
    private WebElement us500;
    @AndroidFindBy(accessibility = "ETH coin price")
    private WebElement ethCoinPrice;
    @AndroidFindBy(accessibility = "ethereum coin’s price")
    private WebElement ethereumCoinsPrice;
    @AndroidFindBy(accessibility = "cryptocurrency prices")
    private WebElement cryptocurrencyPrices;
    @AndroidFindBy(accessibility = "ether price")
    private WebElement etherPrice;
    @AndroidFindBy(accessibility = "stock market")
    private WebElement stockMarket;


    public EthereumPricePredictionElements(AndroidDriver driver) {
        super(driver);
    }

    public void goToArticles() throws Exception {
        exit.click();
        Thread.sleep(2000);
        articles.click();
        Thread.sleep(2000);
    }

    public EthereumPricePredictionElements tapEthereumPricePrediction() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2000))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(620, 1200))
                .release()
                .perform();
        etheriumPricePrediction.click();
        return this;
    }

    public EthereumPricePredictionElements tapEthereum() {
        etherium.click();
        return this;
    }

    public EthereumPricePredictionElements tapBlockchain() {
        blockchain.click();
        return this;
    }

    public EthereumPricePredictionElements tapStablecoin() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2000))
                .moveTo(PointOption.point(620, 900))
                .release()
                .perform();
        stablecoin.click();
        return this;
    }

    public EthereumPricePredictionElements tapLiquidityPool() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2100))
                .moveTo(PointOption.point(620, 700))
                .release()
                .perform();
        liquidityPool.click();
        return this;
    }

    public EthereumPricePredictionElements tapBtc() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2100))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        btc.click();
        return this;
    }

    public EthereumPricePredictionElements tapBt() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2100))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        bt.click();
        return this;
    }

    public EthereumPricePredictionElements tapFlashCrash() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2100))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        flashCrash.click();
        return this;
    }

    public EthereumPricePredictionElements tapCryptocurrencyMarkets() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2200))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        cryptocurrencyMarkets.click();
        return this;
    }

    public EthereumPricePredictionElements tapPow() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 400))
                .release()
                .perform();
        pow.click();
        return this;
    }

    public EthereumPricePredictionElements tapPos() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 400))
                .release()
                .perform();
        pos.click();
        return this;
    }

    //don't active
    public EthereumPricePredictionElements tapEthereumUpgrade() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
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
        ethereumUpgrade.click();
        return this;
    }

    public EthereumPricePredictionElements tapDApps() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        dApps.click();
        return this;
    }

    public EthereumPricePredictionElements tapDeFi() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        deFi.click();
        return this;
    }

    public EthereumPricePredictionElements tapNFTs() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        nfts.click();
        return this;
    }

    public EthereumPricePredictionElements tapDeFiLlama() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        deFiLlama.click();
        return this;
    }

    public EthereumPricePredictionElements tapEthereum2() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        etherium.click();
        return this;
    }

    public EthereumPricePredictionElements tapSeesThePotential() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 400))
                .release()
                .perform();
        seesThePotential.click();
        return this;
    }

    public EthereumPricePredictionElements tapBitcoins() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 400))
                .release()
                .perform();
        bitcoins.click();
        return this;
    }

    public EthereumPricePredictionElements tapUS500() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 300))
                .release()
                .perform();
        us500.click();
        return this;
    }

    public EthereumPricePredictionElements tapEthCoinPrice() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 200))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 200))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 200))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 100))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 100))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 100))
                .release()
                .perform();
        ethCoinPrice.click();
        return this;
    }

    public EthereumPricePredictionElements tapEthereumCoinsPrice() throws InvalidSelectorException {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        ethereumCoinsPrice.click();
        return this;
    }

    public EthereumPricePredictionElements tapCryptocurrencyPrices() throws Exception {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        Thread.sleep(2000);
        touchAction
                .tap(PointOption.point(1125, 850))
                .perform();
        cryptocurrencyPrices.click();
        return this;
    }

    public EthereumPricePredictionElements tapStockMarket() throws InvalidSelectorException {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        stockMarket.click();
        return this;
    }

    public EthereumPricePredictionElements tapEtherPrice() throws InvalidSelectorException {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        etherPrice.click();
        return this;
    }
}

package org.example.pageElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.example.abstractClasses.AbstractPageObject;
import org.openqa.selenium.InvalidSelectorException;

import java.time.Duration;

public class EthereumPricePredictionElements extends AbstractPageObject {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private MobileElement exit;
    @AndroidFindBy(accessibility = "Articles\n" +
            "Tab 2 of 4")
    private MobileElement articles;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Ethereum price prediction for 2022 and beyond: Will ETH ever hit $10,000?\n" +
            "crypto\n" +
            "May 12, 2022  15:09\"]")
    private MobileElement etheriumPricePrediction;
    @AndroidFindBy(accessibility = "ETH")
    private MobileElement etherium;
    @AndroidFindBy(accessibility = "blockchain")
    private MobileElement blockchain;
    @AndroidFindBy(accessibility = "stablecoin")
    private MobileElement stablecoin;
    @AndroidFindBy(accessibility = "liquidity pool")
    private MobileElement liquidityPool;
    @AndroidFindBy(accessibility = "BTC")
    private MobileElement btc;
    @AndroidFindBy(accessibility = "BT")
    private MobileElement bt;
    @AndroidFindBy(accessibility = "flash crash")
    private MobileElement flashCrash;
    @AndroidFindBy(accessibility = "Cryptocurrency markets")
    private MobileElement cryptocurrencyMarkets;
    @AndroidFindBy(accessibility = "PoW")
    private MobileElement pow;
    @AndroidFindBy(accessibility = "PoS")
    private MobileElement pos;
    @AndroidFindBy(accessibility = "Ethereum 2.0 upgrade")
    private MobileElement ethereumUpgrade;
    @AndroidFindBy(accessibility = "dApps")
    private MobileElement dApps;
    @AndroidFindBy(accessibility = "DeFi")
    private MobileElement deFi;
    @AndroidFindBy(accessibility = "NFTs")
    private MobileElement nfts;
    @AndroidFindBy(accessibility = "DeFi Llama")
    private MobileElement deFiLlama;
    @AndroidFindBy(accessibility = "sees the potential")
    private MobileElement seesThePotential;
    @AndroidFindBy(accessibility = "bitcoins")
    private MobileElement bitcoins;
    @AndroidFindBy(accessibility = "US500")
    private MobileElement us500;
    @AndroidFindBy(accessibility = "ETH coin price")
    private MobileElement ethCoinPrice;
    @AndroidFindBy(accessibility = "ethereum coin’s price")
    private MobileElement ethereumCoinsPrice;
    @AndroidFindBy(accessibility = "cryptocurrency prices")
    private MobileElement cryptocurrencyPrices;
    @AndroidFindBy(accessibility = "ether price")
    private MobileElement etherPrice;
    @AndroidFindBy(accessibility = "stock market")
    private MobileElement stockMarket;


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
        dApps.click();
        return this;
    }

    public EthereumPricePredictionElements tapDeFi() {
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
        deFi.click();
        return this;
    }

    public EthereumPricePredictionElements tapNFTs() {
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
        nfts.click();
        return this;
    }

    public EthereumPricePredictionElements tapDeFiLlama() {
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
        deFiLlama.click();
        return this;
    }

    public EthereumPricePredictionElements tapEthereum2() {
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
        etherium.click();
        return this;
    }

    public EthereumPricePredictionElements tapSeesThePotential() {
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
        seesThePotential.click();
        return this;
    }

    public EthereumPricePredictionElements tapBitcoins() {
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
        bitcoins.click();
        return this;
    }

    public EthereumPricePredictionElements tapUS500() {
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
        us500.click();
        return this;
    }

    public EthereumPricePredictionElements tapEthCoinPrice() {
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
        ethCoinPrice.click();
        return this;
    }

    public EthereumPricePredictionElements tapEthereumCoinsPrice() throws InvalidSelectorException {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(5)"));
        ethereumCoinsPrice.click();
        return this;
    }

    public EthereumPricePredictionElements tapCryptocurrencyPrices() throws InvalidSelectorException {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(5)"));
        cryptocurrencyPrices.click();
        return this;
    }

    public EthereumPricePredictionElements tapStockMarket() throws InvalidSelectorException {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(5)"));
        stockMarket.click();
        return this;
    }

    public EthereumPricePredictionElements tapEtherPrice() throws InvalidSelectorException {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(5)"));
        etherPrice.click();
        return this;
    }
}

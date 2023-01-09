package org.example.pageElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.example.abstractClasses.AbstractPageObject;

public class AvaxPricePrediction extends AbstractPageObject {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private MobileElement exit;
    @AndroidFindBy(accessibility = "Articles\n" +
            "Tab 2 of 4")
    private MobileElement articles;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"AVAX price prediction: Will Avalanche fall further?\n" +
            "crypto\n" +
            "May 13, 2022  10:22\"]")
    private MobileElement avaxPricePrediction;
    @AndroidFindBy(accessibility = "AVAX")
    private MobileElement avax;
    @AndroidFindBy(accessibility = "BTC")
    private MobileElement btc;
    @AndroidFindBy(accessibility = "blockchain")
    private MobileElement blockchain;
    @AndroidFindBy(accessibility = "Smart contract")
    private MobileElement smartContract;
    @AndroidFindBy(accessibility = "DeFi")
    private MobileElement deFi;
    @AndroidFindBy(accessibility = "SOL")
    private MobileElement sol;
    @AndroidFindBy(accessibility = "ETH")
    private MobileElement ethereum;
    @AndroidFindBy(accessibility = "gas fees")
    private MobileElement gasFees;

    public AvaxPricePrediction(AndroidDriver driver) {
        super(driver);
    }

    public void goToArticles() throws Exception {
        exit.click();
        Thread.sleep(3000);
        articles.click();
        Thread.sleep(3000);
    }

    public AvaxPricePrediction tapAvaxPricePrediction() {
        avaxPricePrediction.click();
        return this;
    }

    public AvaxPricePrediction tapAvax() {
        avax.click();
        return this;
    }

    public AvaxPricePrediction tapBtc() {
        btc.click();
        return this;
    }

    public AvaxPricePrediction tapBlockchain() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        blockchain.click();
        return this;
    }

    public AvaxPricePrediction tapSmartContract() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        smartContract.click();
        return this;
    }

    public AvaxPricePrediction tapDeFi() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        deFi.click();
        return this;
    }

    public AvaxPricePrediction tapSol() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        sol.click();
        return this;
    }

    public AvaxPricePrediction tapEthereum() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        ethereum.click();
        return this;
    }

    public AvaxPricePrediction tapGasFees() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        gasFees.click();
        return this;
    }

    public AvaxPricePrediction tapAvax2() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        avax.click();
        return this;
    }
}

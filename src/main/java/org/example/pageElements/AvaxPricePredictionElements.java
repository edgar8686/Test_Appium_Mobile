package org.example.pageElements;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.example.abstractClass.AbstractPageObject;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebElement;

public class AvaxPricePredictionElements extends AbstractPageObject {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private WebElement exit;
    @AndroidFindBy(accessibility = "Articles\n" +
            "Tab 2 of 4")
    private WebElement articles;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"AVAX price prediction: Will Avalanche fall further?\n" +
            "crypto\n" +
            "May 13, 2022  10:22\"]")
    private WebElement avaxPricePrediction;
    @AndroidFindBy(accessibility = "AVAX")
    private WebElement avax;
    @AndroidFindBy(accessibility = "BTC")
    private WebElement btc;
    @AndroidFindBy(accessibility = "blockchain")
    private WebElement blockchain;
    @AndroidFindBy(accessibility = "Smart contract")
    private WebElement smartContract;
    @AndroidFindBy(accessibility = "DeFi")
    private WebElement deFi;
    @AndroidFindBy(accessibility = "SOL")
    private WebElement sol;
    @AndroidFindBy(accessibility = "ETH")
    private WebElement ethereum;
    @AndroidFindBy(accessibility = "gas fees")
    private WebElement gasFees;
    @AndroidFindBy(accessibility = "Avalanche’s whitepaper")
    private WebElement avalancheWhitepaper;
    @AndroidFindBy(accessibility = "PoS")
    private WebElement pos;
    //AVAX3
    @AndroidFindBy(accessibility = "staking")
    private WebElement staking;
    //AVAX4
    @AndroidFindBy(accessibility = "web3")
    private WebElement web3;
    @AndroidFindBy(accessibility = "AVAX token price")
    private WebElement avaxTokenPrice;
    @AndroidFindBy(id = "com.android.chrome:id/infobar_message")
    private WebElement link;

    public AvaxPricePredictionElements(AndroidDriver driver) {
        super(driver);
    }

    public void goToArticles() throws Exception {
        exit.click();
        Thread.sleep(2000);
        articles.click();
        Thread.sleep(2000);
    }

    public AvaxPricePredictionElements tapAvaxPricePrediction() {
        avaxPricePrediction.click();
        return this;
    }

    public AvaxPricePredictionElements tapAvax() {
        avax.click();
        return this;
    }

    public AvaxPricePredictionElements tapBtc() {
        btc.click();
        return this;
    }

    public AvaxPricePredictionElements tapBlockchain() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        blockchain.click();
        return this;
    }

    public AvaxPricePredictionElements tapSmartContract() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        smartContract.click();
        return this;
    }

    public AvaxPricePredictionElements tapDeFi() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        deFi.click();
        return this;
    }

    public AvaxPricePredictionElements tapSol() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        sol.click();
        return this;
    }

    public AvaxPricePredictionElements tapEthereum() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        ethereum.click();
        return this;
    }

    public AvaxPricePredictionElements tapGasFees() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        gasFees.click();
        return this;
    }

    public AvaxPricePredictionElements tapAvax2() {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        avax.click();
        return this;
    }

    public AvaxPricePredictionElements tapAvalancheWhitepaper() throws InvalidSelectorException {
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
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

        //getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
        //     "new UiScrollable(new UiSelector().scrollable(true)).flingForward()"));
        avalancheWhitepaper.click();
        return this;
    }

    public AvaxPricePredictionElements tapPos() {
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
        pos.click();
        return this;
    }

    public AvaxPricePredictionElements tapAvax3() {
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
        avax.click();
        return this;
    }

    public AvaxPricePredictionElements tapAvax4() {
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
        avax.click();
        return this;
    }

    public AvaxPricePredictionElements tapStaking() {
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
        staking.click();
        return this;
    }

    public AvaxPricePredictionElements tapWeb3() {
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
        web3.click();
        return this;
    }

    public AvaxPricePredictionElements tapAvaxTokenPrice() throws InvalidSelectorException {
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
        avaxTokenPrice.click();
        return this;
    }

    public AvaxPricePredictionElements tapLink() {
        link.click();
        return this;
    }

}

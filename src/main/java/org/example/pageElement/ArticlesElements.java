package org.example.pageElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.example.abstractClasses.AbstractPageObject;

public class ArticlesElements extends AbstractPageObject {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Welcome to Crypto Investmate — become a part of the crypto world!\"]/android.widget.ImageView[1]")
    private MobileElement exit;
    @AndroidFindBy(accessibility = "Articles\n" +
            "Tab 2 of 4")
    private MobileElement articles;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Shiba inu price prediction: Can the meme coin stop the slide?\n" +
            "crypto\n" +
            "May 09, 2022  12:07\"]")
    private MobileElement shibaInuPrice;
    @AndroidFindBy(accessibility = "SHIB")
    private MobileElement shib;
    @AndroidFindBy(accessibility = "DOGE")
    private MobileElement doge;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Robinhood listed the coin\"]")
    private MobileElement listedRobinhood;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Shiba inu\"]")
    private MobileElement shibaInu;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"bitcoin (BTC)\"]")
    private MobileElement bitcoinBtc;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"NFT\"]")
    private MobileElement nft;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"SHIB coin price\"]")
    private MobileElement shibCoinPrice;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"decentralised autonomous organisation\"]")
    private MobileElement dao;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"SHIB\"]")
    private MobileElement shib2;
    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"SHIB\"])[1]")
    private MobileElement shib3;
    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"SHIB\"])[2]")
    private MobileElement shib4;
    @AndroidFindBy(accessibility = "CRO price prediction: Will the Crypto.com token rebound?\n" +
            "crypto\n" +
            "May 12, 2022  15:55")
    private MobileElement croPrice;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"CRO\"]")
    private MobileElement cro;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"CRO\"][2]")
    private MobileElement cro2;
    @AndroidFindBy(accessibility = "decentralised finance (DeFi),")
    private MobileElement deFi;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Web3\"]")
    private MobileElement web3;
    @AndroidFindBy(accessibility = "non-fungible token (NFT)")
    private MobileElement nonFungibleToken;
    @AndroidFindBy(accessibility = "Crypto.com whitepaper")
    private MobileElement whitepaper;
    @AndroidFindBy(accessibility = "staking")
    private MobileElement staking;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"CRO\"]")
    private MobileElement cro3;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"technical analysis\"]")
    private MobileElement technicalAnalysis;
    @AndroidFindBy(accessibility = "Relative Strength Index (RSI)")
    private MobileElement relativeStrengthIndex;
    @AndroidFindBy(accessibility = "moving averages")
    private MobileElement movingAverages;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"CRO\"]")
    private MobileElement cro4;
    @AndroidFindBy(accessibility = "announced")
    private MobileElement announced;
    @AndroidFindBy(accessibility = "mainnet")
    private MobileElement mainnet;
    @AndroidFindBy(accessibility = "@cronos_chain")
    private MobileElement cronosChain;
    @AndroidFindBy(accessibility = "CRO/USD")
    private MobileElement croUsd;


    public ArticlesElements(AndroidDriver driver) {
        super(driver);
    }

    public ArticlesElements tapExit() {
        exit.click();
        return this;
    }

    public ArticlesElements tapArticles() {
        articles.click();
        return this;
    }

    public ArticlesElements tapShibaInuPrice() {
        shibaInuPrice.click();
        return this;
    }

    public ArticlesElements tapShibLink() {
        shib.click();
        return this;
    }

    public void goToArticles() throws Exception {
        exit.click();
        Thread.sleep(3000);
        articles.click();
        Thread.sleep(3000);
    }

    public ArticlesElements tapDoge() {
        doge.click();
        return this;
    }

    public ArticlesElements tapListedRobinhoodLink() {
        listedRobinhood.click();
        return this;
    }

    public ArticlesElements tapShibaInu() {
        shibaInu.click();
        return this;
    }

    public ArticlesElements tapBitcoinBtc() {
        bitcoinBtc.click();
        return this;
    }

    public ArticlesElements tapNft() {
        nft.click();
        return this;
    }

    public ArticlesElements tapShibCoinPrice() {
        shibCoinPrice.click();
        return this;
    }

    public ArticlesElements tapDao() {
        dao.click();
        return this;
    }

    public ArticlesElements tapShib2() {
        shib2.click();
        return this;
    }

    public ArticlesElements tapShib3() {
        shib3.click();
        return this;
    }

    public ArticlesElements tapShib4() {
        shib4.click();
        return this;
    }

    public ArticlesElements tapCroPrice() {
        croPrice.click();
        return this;
    }

    public ArticlesElements tapCro() {
        cro.click();
        return this;
    }

    public ArticlesElements tapCro2() {
        cro.click();
        return this;
    }

    public ArticlesElements tapDeFi() {
        deFi.click();
        return this;
    }

    public ArticlesElements tapWeb3() {
        web3.click();
        return this;
    }

    public ArticlesElements tapNonFungibleToken() {
        nonFungibleToken.click();
        return this;
    }

    public ArticlesElements tapWhitepaper() {
        whitepaper.click();
        return this;
    }

    public ArticlesElements tapStaking() {
        staking.click();
        return this;
    }

    public ArticlesElements tapCro3() {
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
        cro3.click();
        return this;
    }

    public ArticlesElements tapTechnicalAnalysis() {
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
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        technicalAnalysis.click();
        return this;
    }

    public ArticlesElements tapRelativeStrengthIndex() {
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
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        relativeStrengthIndex.click();
        return this;
    }

    public ArticlesElements tapMovingAverages() {
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
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        movingAverages.click();
        return this;
    }

    public ArticlesElements tapCro4() {
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
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 800))
                .release()
                .perform();
        cro4.click();
        return this;
    }

    public ArticlesElements tapAnnounced() {
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
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        announced.click();
        return this;
    }

    public ArticlesElements tapMainnet() {
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
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2000))
                .moveTo(PointOption.point(620, 800))
                .release()
                .perform();
        mainnet.click();
        return this;
    }

    public ArticlesElements tapCronosChain() {
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
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 600))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2000))
                .moveTo(PointOption.point(620, 800))
                .release()
                .perform();
        cronosChain.click();
        return this;
    }

    public ArticlesElements tapCroUsd() {
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
                .moveTo(PointOption.point(620, 400))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 500))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 400))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 400))
                .release()
                .perform();
        touchAction
                .press(PointOption.point(620, 2400))
                .moveTo(PointOption.point(620, 400))
                .release()
                .perform();
        croUsd.click();
        return this;
    }

}

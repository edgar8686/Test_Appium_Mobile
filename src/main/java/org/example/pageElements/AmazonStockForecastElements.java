package org.example.pageElements;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.example.abstractClass.AbstractPageObject;
import org.example.helpClass.Swipe;
import org.example.myEnum.Side;

public class AmazonStockForecastElements extends AbstractPageObject {
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Amazon stock forecast for 2022: Should you buy the dip?\n" +
            "stocks\n" +
            "May 11, 2022  16:50\"]")
    private MobileElement amazonStockForecast;
    @AndroidFindBy(accessibility = "AMZN")
    private MobileElement amazon;
    @AndroidFindBy(accessibility = "announcing")
    private MobileElement announcing;
    @AndroidFindBy(accessibility = "RIVN")
    private MobileElement rivn;
    @AndroidFindBy(accessibility = "year-on-year")
    private MobileElement yearOnYear;
    @AndroidFindBy(accessibility = "filed a statement")
    private MobileElement filedStatement;
    @AndroidFindBy(accessibility = "(SEC)")
    private MobileElement sec;
    @AndroidFindBy(accessibility = "split")
    private MobileElement split;
    @AndroidFindBy(accessibility = "dotcom")
    private MobileElement dotcom;
    @AndroidFindBy(accessibility = "Trading of Amazon shares")
    private MobileElement tradingOfAmazonShares;
    @AndroidFindBy(accessibility = "buy back shares")
    private MobileElement buyBackShares;
    @AndroidFindBy(accessibility = "GOOGL")
    private MobileElement google;
    @AndroidFindBy(accessibility = "AAPL")
    private MobileElement apple;
    @AndroidFindBy(accessibility = "TSLA")
    private MobileElement tesla;
    @AndroidFindBy(accessibility = "Amazon share value")
    private MobileElement amazonShareValue;
    @AndroidFindBy(accessibility = "noted")
    private MobileElement noted;
    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"AMZN\"])[1]")
    private MobileElement amazon1;
    @AndroidFindBy(xpath = "(//android.widget.Button[@content-desc=\"AMZN\"])[2]")
    private MobileElement amazon2;
    @AndroidFindBy(accessibility = "MAs")
    private MobileElement mas;
    @AndroidFindBy(accessibility = "RSI")
    private MobileElement rsi;
    @AndroidFindBy(xpath = "((//android.widget.Button[@content-desc=\"AMZN\"])[3]")
    private MobileElement amazon3;
    @AndroidFindBy(accessibility = "stock")
    private MobileElement stock;

    public AmazonStockForecastElements(AndroidDriver driver) {
        super(driver);
    }


    public AmazonStockForecastElements tapAmazonStockForecast() {
        // TouchAction touchAction = new TouchAction(getAndroidDriver());
        //  touchAction
        //           .press(PointOption.point(620, 2000))
        //           .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
        //           .moveTo(PointOption.point(620, 600))
        //           .release()
        //           .perform();
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_SECTION);
        amazonStockForecast.click();
        return this;
    }

    public AmazonStockForecastElements tapAmazon() {
        amazon.click();
        return this;
    }

    public AmazonStockForecastElements tapAnnouncing() {
        announcing.click();
        return this;
    }

    public AmazonStockForecastElements tapRivn() {
        rivn.click();
        return this;
    }

    public AmazonStockForecastElements tapRivn2() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        rivn.click();
        return this;
    }

    public AmazonStockForecastElements tapYearOnYear() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        yearOnYear.click();
        return this;
    }

    public AmazonStockForecastElements tapFiledStatement() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        filedStatement.click();
        return this;
    }

    public AmazonStockForecastElements tapSec() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        sec.click();
        return this;
    }

    public AmazonStockForecastElements tapSplit() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        split.click();
        return this;
    }

    public AmazonStockForecastElements tapDotcom() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        dotcom.click();
        return this;
    }

    public AmazonStockForecastElements tapTradingOfAmazonShares() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        tradingOfAmazonShares.click();
        return this;
    }

    public AmazonStockForecastElements tapBuyBackShares() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        buyBackShares.click();
        return this;
    }

    public AmazonStockForecastElements tapGoogle() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        google.click();
        return this;
    }

    public AmazonStockForecastElements tapApple() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        apple.click();
        return this;
    }

    public AmazonStockForecastElements tapTesla() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        tesla.click();
        return this;
    }

    public AmazonStockForecastElements tapAmazonShareValue() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        amazonShareValue.click();
        return this;
    }

    public AmazonStockForecastElements tapNoted() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        noted.click();
        return this;
    }

    public AmazonStockForecastElements tapAmazon1() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        amazon1.click();
        return this;
    }

    public AmazonStockForecastElements tapAmazon2() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        amazon2.click();
        return this;
    }

    public AmazonStockForecastElements tapMA() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        mas.click();
        return this;
    }

    public AmazonStockForecastElements tapRSI() {
        Swipe swipe = new Swipe(getAndroidDriver());
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_FAST);
        swipe.swipeScreen(Side.UP_SHORT);
        rsi.click();
        return this;
    }

    public AmazonStockForecastElements tapAmazon3() {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        amazon1.click();
        return this;
    }

    public AmazonStockForecastElements tapAmazon4() {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        amazon2.click();
        return this;
    }

    public AmazonStockForecastElements tapAmazon5() {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        amazon2.click();
        return this;
    }

    public AmazonStockForecastElements tapStock() {
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        getAndroidDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(false)).flingForward()"));
        stock.click();
        return this;
    }
}

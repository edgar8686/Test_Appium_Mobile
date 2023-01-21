package org.example.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.example.abstractClass.AbstractPageObject;

import java.time.Duration;

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
        TouchAction touchAction = new TouchAction(getAndroidDriver());
        touchAction
                .press(PointOption.point(620,2000))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .moveTo(PointOption.point(620,800))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                .release()
                .perform();
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
        rivn.click();
        return this;
    }
    public AmazonStockForecastElements tapYearOnYear() {
        yearOnYear.click();
        return this;
    }
    public AmazonStockForecastElements tapFiledStatement() {
        filedStatement.click();
        return this;
    }
    public AmazonStockForecastElements tapSec() {
        sec.click();
        return this;
    }
    public AmazonStockForecastElements tapSplit() {
        split.click();
        return this;
    }
    public AmazonStockForecastElements tapDotcom() {
        dotcom.click();
        return this;
    }
    public AmazonStockForecastElements tapTradingOfAmazonShares() {
        tradingOfAmazonShares.click();
        return this;
    }
    public AmazonStockForecastElements tapBuyBackShares() {
        buyBackShares.click();
        return this;
    }
    public AmazonStockForecastElements tapGoogle() {
        google.click();
        return this;
    }
    public AmazonStockForecastElements tapApple() {
        apple.click();
        return this;
    }
    public AmazonStockForecastElements tapTesla() {
        tesla.click();
        return this;
    }
    public AmazonStockForecastElements tapAmazonShareValue() {
        amazonShareValue.click();
        return this;
    }
    public AmazonStockForecastElements tapNoted() {
        noted.click();
        return this;
    }
    public AmazonStockForecastElements tapAmazon1() {
        amazon1.click();
        return this;
    }
    public AmazonStockForecastElements tapAmazon2() {
        amazon2.click();
        return this;
    }
    public AmazonStockForecastElements tapMA() {
        mas.click();
        return this;
    }
    public AmazonStockForecastElements tapRSI() {
        rsi.click();
        return this;
    }
    public AmazonStockForecastElements tapAmazon3() {
        amazon1.click();
        return this;
    }
    public AmazonStockForecastElements tapAmazon4() {
        amazon2.click();
        return this;
    }
    public AmazonStockForecastElements tapAmazon5() {
        amazon3.click();
        return this;
    }
    public AmazonStockForecastElements tapStock() {
        stock.click();
        return this;
    }
}

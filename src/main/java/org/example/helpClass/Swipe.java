package org.example.helpClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.example.abstractClass.AbstractPageObject;
import org.example.myEnum.Sides;
import org.openqa.selenium.Dimension;

public class Swipe extends AbstractPageObject {
    final int ANIMATION_TIME = 2000;
    final int PRESS_TIME = 2000;
    int edgeBorder = 250;
    PointOption pointOptionStart;
    PointOption pointOptionEnd;
    PointOption pointOptionStartZone;

    public Swipe(AndroidDriver driver) {
        super(driver);
    }

    public void swipeScreen(Sides sides) {
        System.out.println("swipeScreen(): dir: '" + sides + "'");
        Dimension dims = getAndroidDriver().manage().window().getSize();
        pointOptionStart = PointOption.point(dims.width / 2, dims.height - edgeBorder);
        pointOptionStartZone = PointOption.point(dims.width - edgeBorder, (int) (dims.height / 3.3));
        switch (sides) {
            case UP:
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - (int) (dims.height / 1.15));
                break;
            case LEFT:
                pointOptionEnd = PointOption.point(edgeBorder, (int) (dims.height / 3.3));
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + sides + "' NOT supported");
        }
    }
}

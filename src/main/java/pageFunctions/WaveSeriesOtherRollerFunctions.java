package pageFunctions;

import base.Setup;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import pageObjects.AddDeviceObjects;
import pageObjects.PrimeDeviceObjects;
import pageObjects.WaveSeriesOtherRollerObjects;
import pageObjects.WaveSeriesSoloObjects;

import java.time.Duration;

public class WaveSeriesOtherRollerFunctions extends Setup {

    public WaveSeriesOtherRollerObjects waveRollerObjects;
    public AddDeviceObjects addDeviceObjects;
    public WaveSeriesSoloObjects waveSoloObjects;
    public WaveSeriesSoloFunctions waveSoloFunctions;
    public PrimeDeviceObjects primeObj;

    public WaveSeriesOtherRollerFunctions(){
        waveRollerObjects = new WaveSeriesOtherRollerObjects();
       addDeviceObjects = new AddDeviceObjects();
       waveSoloObjects = new WaveSeriesSoloObjects();
       waveSoloFunctions = new WaveSeriesSoloFunctions();
    }

    public void pairOtherRoller(){
        waitForElementClickAbility(addDeviceObjects.deviceDropDown);
        waitForElementClickAbility(waveRollerObjects.waveSeriesCategory);
        waitForElementClickAbility(waveRollerObjects.otherRoller);
        waitForElementVisibility(waveRollerObjects.pairedOtherRoller);
        Assert.assertTrue(waveRollerObjects.pairedOtherRoller.isDisplayed());
        waitForElementClickAbility(waveSoloObjects.closeDeviceManager);
    }

    public void selectRoutine(){
        waitForElementClickAbility(waveRollerObjects.recoveryRoutine);
    }

    public void backHomePage(){
        waitForElementClickAbility(primeObj.homeTab);
        System.out.println("Welcome back to Homepage");
        log.info("Welcome back to Homepage");
    }

    public void horizontalScroll(){
        TouchAction horizontalScroll = new TouchAction((PerformsTouchActions) driver);
        Dimension size = driver.manage().window().getSize();
        int width = size.width;
        int height = size.height;
        int startXCoordinate = (int) (width * 0.7); // Start from the right side of the screen
        int endXCoordinate = (int) (width * 0.2); // End at the left side of the screen
        int middleOfY = height / 2;

        horizontalScroll.press(PointOption.point(startXCoordinate, middleOfY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endXCoordinate, middleOfY)).release().perform();
    }

    public void verticalScroll(){
        TouchAction verticalScroll =new TouchAction((PerformsTouchActions) driver);
        Dimension size	=driver.manage().window().getSize();
        int width=size.width;
        int height=size.height;
        int middleOfX=width/2;
        int startYCoordinate= (int)(height*.7);
        int endYCoordinate= (int)(height*.2);

        verticalScroll.press(PointOption.point(middleOfX, startYCoordinate))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
    }
}

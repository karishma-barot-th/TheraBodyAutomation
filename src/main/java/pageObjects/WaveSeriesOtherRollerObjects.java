package pageObjects;

import base.Setup;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WaveSeriesOtherRollerObjects extends Setup {

    public WaveSeriesOtherRollerObjects(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Wave Series\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Wave Series']")
    public WebElement waveSeriesCategory;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Other Roller\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Other']")
    public WebElement otherRoller;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Other Roller\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Other Roller']")
    public WebElement pairedOtherRoller;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Run Recovery\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Run Recovery']")
    public WebElement recoveryRoutine;
}

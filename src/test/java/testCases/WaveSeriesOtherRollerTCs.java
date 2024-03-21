package testCases;

import base.Setup;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageFunctions.PrimeDeviceFunctions;
import pageFunctions.WaveSeriesOtherRollerFunctions;
import pageFunctions.WaveSeriesSoloFunctions;

public class WaveSeriesOtherRollerTCs extends Setup {

    public WaveSeriesOtherRollerFunctions waveRollerFunctions;
    public WaveSeriesSoloFunctions waveSoloFunctions;
    public PrimeDeviceFunctions primeDeviceFunctions;

    @BeforeClass
    public void init(){
        waveRollerFunctions = new WaveSeriesOtherRollerFunctions();
        waveSoloFunctions = new WaveSeriesSoloFunctions();
        primeDeviceFunctions = new PrimeDeviceFunctions();
    }

    @Test(priority = 21)
    public void testPairOtherRollerDevice(){
        waveRollerFunctions.pairOtherRoller();
    }

    @Test(priority = 22)
    public void testSelectRoutine() throws InterruptedException {
        waveRollerFunctions.selectRoutine();
    }

    @Test(priority = 23)
    public void testStretchingStep() throws InterruptedException {
        waveSoloFunctions.routineStepStretching();
    }

    @Test(priority = 24)
    public void testBreakToggle() throws InterruptedException {
        waveSoloFunctions.addBreak();
    }

    @Test(priority = 25)
    public void testForgetDevice(){
       // waveRollerFunctions.backHomePage();
        primeDeviceFunctions.forgetDevice();
    }
}

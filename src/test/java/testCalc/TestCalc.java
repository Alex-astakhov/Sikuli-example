package testCalc;

import objects.Calc;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by Alex Astakhov on 26.07.2016.
 */
public class TestCalc {

    private static App app;

    @BeforeTest
    public void openCalc() throws InterruptedException {
        app = App.open("C:\\Windows\\system32\\calc.exe");
       // Thread.sleep(3000);
        ImagePath.add("E:\\sikuliScreens");
    }


    @Test
    public void testPlus() throws InterruptedException, AWTException, FindFailed {
        Calc calc = new Calc();
        calc.pressNum(1);
        calc.pressNum(2);
        calc.pressPlus();
        calc.pressNum(3);
        calc.pressNum(3);
        calc.pressEquals();
        Assert.assertTrue(calc.isPatternExists(45));
    }

    @Test
    public void testMinus() throws InterruptedException, AWTException, FindFailed {
        Calc calc = new Calc();
        calc.pressNum(6);
        calc.pressNum(6);
        calc.pressMinus();
        calc.pressNum(1);
        calc.pressNum(9);
        calc.pressEquals();
        Assert.assertTrue(calc.isPatternExists(47));
    }

    @Test
    public void testSep() throws InterruptedException, AWTException, FindFailed {
        Calc calc = new Calc();
        calc.pressNum(8);
        calc.pressNum(0);
        calc.pressSep();
        calc.pressNum(1);
        calc.pressNum(6);
        calc.pressEquals();
        Assert.assertTrue(calc.isPatternExists(5));
    }

    @AfterTest
    public void closeClac(){
        app.close("Calculator");
    }
}

package objects;

import org.sikuli.script.*;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * Created by Alex Astakhov on 26.07.2016.
 */
public class Calc {





        private Screen m_screen = new Screen();


    public void pressNum(int num) throws FindFailed, AWTException {
        Pattern one = new Pattern(num + ".png");
        Match m = m_screen.find(one);
        Location target = m.getTarget();
        mouseClick(target.getX(), target.getY());
    }

    public void pressPlus() throws FindFailed, AWTException {
        Pattern one = new Pattern("+.png");
        Match m = m_screen.find(one);
        Location target = m.getTarget();
        mouseClick(target.getX(), target.getY());
    }

    public void pressMinus() throws FindFailed, AWTException {
        Pattern one = new Pattern("-.png");
        Match m = m_screen.find(one);
        Location target = m.getTarget();
        mouseClick(target.getX(), target.getY());
    }

    public void pressSep() throws FindFailed, AWTException {
        Pattern one = new Pattern("_.png");
        Match m = m_screen.find(one);
        Location target = m.getTarget();
        mouseClick(target.getX(), target.getY());
    }

    public void pressMult() throws FindFailed, AWTException {
        Pattern one = new Pattern("x.png");
        Match m = m_screen.find(one);
        Location target = m.getTarget();
        mouseClick(target.getX(), target.getY());
    }

    public void pressQuad() throws FindFailed, AWTException {
        Pattern one = new Pattern("quad.png");
        Match m = m_screen.find(one);
        Location target = m.getTarget();
        mouseClick(target.getX(), target.getY());
    }

    public void pressEquals() throws FindFailed, AWTException {
        Pattern p = new Pattern("=.png");
        Match m = m_screen.find(p);
        Location target = m.getTarget();
        mouseClick(target.getX(), target.getY());
    }

    private static void mouseClick(int x, int y) throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    public boolean isPatternExists(int expectedNum){
        Pattern p = new Pattern(expectedNum + ".png");
        try {
            Match m = m_screen.find(p);
            return true;
        } catch (FindFailed e) {
            return false;
        }
    }
}

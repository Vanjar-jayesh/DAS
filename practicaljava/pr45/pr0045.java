package practicaljava.pr45;

import java.applet.Applet;
import java.awt.Graphics;
/*
 * <applet code="pr0045.class" width="300" height="200"> </applet>
 */

public class pr0045 extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello Applet", 20, 20);
    }
}

/*
 * OUTPUT:
 * Hello Applet 20 20
 */
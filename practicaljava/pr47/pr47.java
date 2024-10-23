package practicaljava.pr47;

import java.applet.Applet;
import java.awt.Graphics;

/*
 * <applet code="pr47" width="300" height="200"> </applet>
 */
public class pr47 extends Applet{
    private String strDefault = "Hello java applet";

    public void paint(Graphics g){
        String srtparameter = this.getParameter("Message");

        if (srtparameter == null) {
            srtparameter = strDefault;
        }
        g.drawString(srtparameter, 50, 25);

    }
}

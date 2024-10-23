package practicaljava.pr48;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class pr48 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawLine(20, 20, 200, 20); 

        g.setColor(Color.RED);
        g.drawRect(20, 40, 150, 100);

        g.setColor(Color.GREEN);
        g.fillRect(200, 40, 150, 100); 

         g.setColor(Color.BLACK);
        g.drawOval(20, 160, 150, 100); 

        g.setColor(Color.ORANGE);
        g.fillOval(200, 160, 150, 100); 

        g.setColor(Color.MAGENTA);
        g.drawOval(20, 280, 100, 100); 

        g.setColor(Color.GRAY);
        int[] xPoints = {150, 100, 200}; 
        int[] yPoints = {300, 400, 400}; 
        g.drawPolygon(xPoints, yPoints, 3); 

        g.setColor(Color.CYAN);
        g.drawString("Graphics in Java Applet", 20, 450); 
    }
}

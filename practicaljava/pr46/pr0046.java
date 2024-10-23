package practicaljava.pr46;

import java.applet.Applet;

public class pr0046 extends Applet {

    public void init() {
        System.out.println("Applet is initialized");
    }

    public void start() {
        System.out.println("Applet has started");
    }

    public void stop() {
        System.out.println("Applet has stopped");
    }

    public void destroy() {
        System.out.println("Applet is destroyed");
    }

    public void paint(Graphics g) {
        g.drawString("Applet Lifecycle Demo", 20, 20);
    }

}

/*
 * OUTPUT:
 * Applet is initialized
 * Applet has started
 * Applet has stopped
 * Applet is destroyed
 * Applet Lifecycle Demo 20 20
 */
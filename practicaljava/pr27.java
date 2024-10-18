package practicaljava;

interface bicycle {
    int a = 45;

    void applybrake(int decrement);

    void speedup(int increment);
}

interface Hornbicyle {
    int x = 45;

    void blowhornk39();

    void blowhornmhn();

}

class Avoncycle implements bicycle, Hornbicyle {
    void blowhorn() {
        System.out.println("pee pee poo poo");
    }

    public void applybrake(int decrement) {
        System.out.println("Applying speedup");
    }

    public void speedup(int increment) {
        System.out.println("Applying Barke:");
    }

    public void blowhornk39() {
        System.out.println("kabhi khushi kabhi gum pee pee pee");
    }

    public void blowhornmhn() {
        System.out.println("main horn popopo");
    }
}

public class pr27 {
    public static void main(String[] args) {

        Avoncycle in = new Avoncycle();
        in.applybrake(1);

        System.out.println("value a: " + in.a);
        System.out.println("value x: " + in.x);

        in.blowhornk39();
        in.blowhornmhn();
    }
}

/*
 * OUTPUT:
 * Applying speedup
 * value a: 45
 * value x: 45
 * kabhi khushi kabhi gum pee pee pee
 * main horn popopo
 */
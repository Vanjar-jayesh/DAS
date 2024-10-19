package practicaljava;

public class pr30 {

    public static void main(String[] args) {

        int a = -10;
        System.out.println("Absolute value of " + a + " is: " + Math.abs(a));

        int b = 15, c = 25;
        System.out.println("Maximum of " + b + " and " + c + " is: " + Math.max(b, c));

        System.out.println("Minimum of " + b + " and " + c + " is: " + Math.min(b, c));

        double d = 49.0;
        System.out.println("Square root of " + d + " is: " + Math.sqrt(d));

        double e = 2.0, f = 5.0;
        System.out.println(e + " raised to the power of " + f + " is: " + Math.pow(e, f));

        double g = 7.75;
        System.out.println(g + " rounded is: " + Math.round(g));

        System.out.println("Random number between 0 and 1: " + Math.random());

    }
}

/*
 * OUTPUT:
 * Absolute value of -10 is: 10
 * Maximum of 15 and 25 is: 25
 * Minimum of 15 and 25 is: 15
 * Square root of 49.0 is: 7.0
 * 2.0 raised to the power of 5.0 is: 32.0
 * 7.75 rounded is: 8
 * Random number between 0 and 1: 0.21628368297516387
 */
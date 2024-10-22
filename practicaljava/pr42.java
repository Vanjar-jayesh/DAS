package practicaljava;

public class pr42 {
    public static int greet() {
        try {
            int a = 50;
            int b = 10;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("cleaning up resources...this is the end of this function:");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
                                                     
    }
}

/*
 * OUTPUT:
 * cleaning up resources...this is the end of this function:
 * 5
 */
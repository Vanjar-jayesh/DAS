package practicaljava;

public class pr43 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        try {
            int c = a / b;
            System.out.println(c);

            try {
                int sum = a + b;
                System.out.println(sum);
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("end of the neste try satatements : ");
    }
}
/*
 * OUTPUT:
 * 5
 * 12
 * end of the neste try satatements :
 */

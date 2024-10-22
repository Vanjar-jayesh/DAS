package practicaljava;

public class pr40 {
    public static void main(String[] args) {
        int a = 600;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("the result is " + c);
        } catch (Exception e) {
            System.out.println("we filed to divide Reason :" + e);
        }

        System.out.println("end of the program :");
    }
}

/*
 * OUTPUT:
 * we filed to divide Reason :java.lang.ArithmeticException: / by zero
 * end of the program :
 */
package practicaljava;

public class pr41 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}

/*
 * OUTPUT:
 * rest of the code
 *                     
 */
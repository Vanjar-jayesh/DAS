package practicaljava;

final class jay {
    final void methids() {
        final int x = 10;

        System.out.println("this method is a final and final class");

    }
}

class jay1 {
    void methids() {
        System.out.println("this method is a simple and simple class");
    }
}

public class pr25 {
    public static void main(String[] args) {

        jay fl = new jay();
        fl.methids();
    }
}
/*
 * OUTPUT:
 * this method is a final and final class
 */
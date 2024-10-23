package practicaljava;

import java.io.IOException;

class testthrowsl {
    void m() throws IOException {
        throw new IOException("device error");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }
}

public class pr44 {
    public static void main(String[] args) {
        testthrowsl obj = new testthrowsl();
        obj.p();
        System.out.println("normal flow...");
    }
}

/*
 * OUTPUT:
 * exception handled
 * normal flow...
 */
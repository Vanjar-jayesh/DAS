package practicaljava;

class myrunnbale1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 2) {
            System.out.println("I am a thresd a not a threatd1:");
            i++;
        }
    }
}

class myrunnbale2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 2) {
            System.out.println(" i am a threas 2 not a theat 2");
            i++;
        }
    }
}

public class pr39 {
    public static void main(String[] args) {
        myrunnbale1 r1 = new myrunnbale1();
        myrunnbale2 r2 = new myrunnbale2();

        Thread gun1 = new Thread(r1);
        Thread gun2 = new Thread(r2);

        gun1.start();
        gun2.start();
    }
}

/*
 * OUTPUT:
 * I am a thresd a not a threatd1:
 * I am a thresd a not a threatd1:
 * i am a threas 2 not a theat 2
 * i am a threas 2 not a theat 2
 */
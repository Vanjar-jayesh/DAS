package practicaljava;

class priority extends Thread {
    public void run() {
        System.out.println("I am thread :" + Thread.currentThread().getName());
        System.out.println(" I am thread:" + Thread.currentThread().getPriority());
    }
}

public class pr38 {
    public static void main(String[] args) {

        priority p1 = new priority();
        priority p2 = new priority();

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);

        p1.start();

        p2.start();
    }
}

/*
 * OUTPUT:
 * I am thread :Thread-1
 * I am thread :Thread-0
 * I am thread:10
 * I am thread:1
 */
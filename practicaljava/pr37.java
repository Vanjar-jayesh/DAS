package practicaljava;

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + " has completed execution.");
    }
}

class pr37 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            // t1.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(t1.getName() + " has been stopped.");
    }
}

/*
 * OUTPUT:
 * Thread 2 is running: 1
 * Thread 1 is running: 1
 * Thread 1 is running: 2
 * Thread 2 is running: 2
 * Thread 1 is running: 3
 * Thread 2 is running: 3
 * Thread 2 is running: 4
 * Thread 1 is running: 4
 * Thread 1 has been stopped.
 * 
 * Thread 2 is running: 5
 * 
 * Thread 2 has completed execution.
 */
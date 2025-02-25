package MultiThreading.join;

class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);

            try {
                Thread.sleep(200);
            } catch(InterruptedException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();

        try {
            t1.join(500, 400); // .5
        } catch(InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        t2.start();
    }
}

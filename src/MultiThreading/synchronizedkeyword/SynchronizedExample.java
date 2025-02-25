package MultiThreading.synchronizedkeyword;

class SharedResource {
    int counter = 0;
    synchronized void countNumbers() {
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 10000; i++) {
            counter++;
        }
    }
}

class MyThread1 extends Thread {
    SharedResource obj;
    MyThread1(SharedResource obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.countNumbers();
    }
}

class MyThread2 extends Thread {
    SharedResource obj;
    MyThread2(SharedResource obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.countNumbers();
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        SharedResource obj = new SharedResource();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.counter);
    }
}

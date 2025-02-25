package MultiThreading.synchronizedkeyword;

class SharedResource2 {
    void printNumbers(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}

class MyNewThread1 extends Thread {
    SharedResource2 obj;
    MyNewThread1(SharedResource2 obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.printNumbers(10);
    }
}

class MyNewThread2 extends Thread {
    SharedResource2 obj;
    MyNewThread2(SharedResource2 obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.printNumbers(20);
    }
}

public class SynchronizedExample2 {
    public static void main(String[] args) throws InterruptedException {
        SharedResource2 obj = new SharedResource2();
        MyNewThread1 t1 = new MyNewThread1(obj);
        MyNewThread2 t2 = new MyNewThread2(obj);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

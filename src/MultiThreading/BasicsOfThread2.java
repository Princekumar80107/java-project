package MultiThreading;

public class BasicsOfThread2 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println("Start Time = " + start);

        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('#');
        PrintTask p3 = new PrintTask('$');

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.setPriority(Thread.MIN_PRIORITY); // request
        t3.setPriority(Thread.MAX_PRIORITY); // request

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        long end = System.currentTimeMillis();
        System.out.println("End Time = " + end);
        System.out.println("Time of Execution = " + (end - start));
    }
}

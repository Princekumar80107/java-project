package MultiThreading;

public class BasicsOfThread {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        System.out.println("Start Time = " + start);

        TaskFirst t1 = new TaskFirst();
        TaskSecond t2 = new TaskSecond();
        TaskThird t3 = new TaskThird();

        // Scale of Priority of Thread
        // 1 to 10 (10 showing high priority, 1 showing very low priority)

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
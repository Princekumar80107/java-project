package MultiThreading;

public class TaskThird extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println();
    }
}

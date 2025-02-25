package MultiThreading.ExcecutorServices;

public class PrintTask extends Thread {

    private char ch;

    PrintTask(char ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ", i, ch);
        }
        System.out.println();
    }
}

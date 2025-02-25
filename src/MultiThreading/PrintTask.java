package MultiThreading;

public class PrintTask implements Runnable {

    private char ch;

    PrintTask(char ch) {
        this.ch = ch;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ", i, ch);
        }
        System.out.println();
    }
}

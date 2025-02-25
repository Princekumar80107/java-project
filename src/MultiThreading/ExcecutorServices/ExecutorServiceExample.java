package MultiThreading.ExcecutorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // executor service is a framework provided by java concurrency api
        try (ExecutorService executor = Executors.newFixedThreadPool(1)) {
            PrintTask t1 = new PrintTask('*');
            PrintTask t2 = new PrintTask('#');
            PrintTask t3 = new PrintTask('@');
            PrintTask t4 = new PrintTask('$');
            executor.submit(t1);
            executor.submit(t2);
            executor.submit(t3);
            executor.submit(t4);
        }
    }
}

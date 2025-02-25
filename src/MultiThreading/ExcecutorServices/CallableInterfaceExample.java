package MultiThreading.ExcecutorServices;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterfaceExample {
    public static void main(String[] args) {

        try(ExecutorService executor =  Executors.newFixedThreadPool(1)) {
            GettingResponseFromDb t1 = new GettingResponseFromDb("8242");
            GettingResponseFromDb t2 = new GettingResponseFromDb("2415");

            Future<String> f1 =  executor.submit(t1);
            Future<String> f2 =  executor.submit(t2);

            String result1 = f1.get(); // main thread is waiting for t1 to complete their task
            System.out.printf("Result from Server For Task 1%s\n", result1);

            String result2 = f2.get();

            System.out.printf("Result from Server For Task 2%s\n", result2);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

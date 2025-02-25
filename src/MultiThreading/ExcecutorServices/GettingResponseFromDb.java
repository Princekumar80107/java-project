package MultiThreading.ExcecutorServices;
import java.util.concurrent.Callable;

public class GettingResponseFromDb implements Callable<String> {
    private String id;

    GettingResponseFromDb(String id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Getting Response From Server");
        Thread.sleep(2000);
        return id.toString() + "XYZ";
    }
}
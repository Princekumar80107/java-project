package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AboutCollections {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(5);
        l.add(5);

        Collections.replaceAll(l, 5, 0);

        System.out.println(l);
    }
}

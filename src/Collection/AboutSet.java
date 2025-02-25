package Collection;

// Properties:
// 1. Unique Elements
// 2. No Duplicate Values Allowed
// 3. Order does to maintain (no index is allowed, random access is not possible)


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AboutSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("Apple");
        s.add("Orange");
        s.add("Guava");
        s.add("Pineapple");
        s.add("Apple");
        s.add("Guava");


//        for(String fruits: s) {
//            System.out.println(fruits);
//        }

        Iterator<String> itr = s.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

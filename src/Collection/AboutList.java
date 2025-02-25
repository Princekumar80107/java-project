package Collection;

// Collection is the root interface in the collection hierarchy, add(), remove(), clear(), size()

// List:
// it is a interface that:
// 1. ordered
// 2. random access is allowed (index)
// 3. duplicate value is allowed
// 4. dynamic

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AboutList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Kiwi");
        list.add("Dragon Fruit");
        list.add("Sugar Cane");
        list.add("Guava");

        // for - each
//        for(String fruits: list) {
//            System.out.println(fruits);
//        }


        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

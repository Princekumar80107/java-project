package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


// Important points;
// 1. FIFO
// 2. not possible random access (index is not used)
// 3. Dynamic
// 4. Duplicate

public class AboutQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        String s = q.peek();
        System.out.println(s);


    }
}

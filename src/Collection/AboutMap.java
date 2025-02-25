package Collection;


// {1 = "John", 2 = "John", 3: "Bob"}
// {'c' = 1}
// {"first": 4.5F}

// Same keys more than one is not allowed in the map
// values corresponding to the key can be same
// Map is part of collections framework but does not extend collection interface
// Size of map is dynamic


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AboutMap {
    public static void main(String[] args) {
        Map<Integer, String> studentData = new HashMap<>();
        // key is of type integer, and value is of type string

        // 1. put()
        studentData.put(1, "John");
        studentData.put(2, "Alice");
        studentData.put(3, "Bob");
        studentData.put(4, "Alice");

        // 2. get()
        // System.out.println(studentData.get(2));

        // 3. remove()
        // studentData.remove(3);

        // 4. containsKey()
        // System.out.println(studentData.containsKey(-9));

        // 5. keySet()
        // System.out.println(studentData.keySet());

        // keySet() is beneficial when we want to loop through map


        // Methods to traverse through map
        // Method 1:
//        for(int key: studentData.keySet()) {
//            System.out.println(studentData.get(key));
//        }

        // Method 2:

        System.out.println(studentData.entrySet());

        for (Map.Entry<Integer, String> entry : studentData.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

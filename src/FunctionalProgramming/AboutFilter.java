package FunctionalProgramming;

import java.util.List;

public class AboutFilter {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Orange", "Kiwi", "Banana", "Date", "Guava", "Pine Apple");
        list.stream().filter(str -> str.endsWith("e")).forEach(System.out::println);
    }
}

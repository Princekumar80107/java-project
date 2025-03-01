package FunctionalProgramming;

import java.util.List;

public class AboutReduce {
    public static void main(String[] args) {
        List<Integer> lst = List.of(1, 3, 9, 10, 7, 20, 5);

        int sum = lst.stream().reduce(1, (a, b) -> a * b);
        System.out.println(sum);
    }
}

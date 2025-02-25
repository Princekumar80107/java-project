package Collection;

public class Varargs {

    static void findSum(String name, int... nums) {
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        findSum(2);
//        findSum(3, 4);
//        findSum(2, 3, 4, 7, 8, 10);
    }
}

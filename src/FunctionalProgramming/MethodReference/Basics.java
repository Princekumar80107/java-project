package FunctionalProgramming.MethodReference;

@FunctionalInterface
interface checkPrime {
    boolean isPrime(int num);
}

public class Basics {
    public static void main(String[] args) {

        checkPrime c = n -> {
            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(c.isPrime(40));
        System.out.println(c.isPrime(3));
    }
}

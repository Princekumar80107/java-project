package OOPs;

public class AboutStatic {

    // attribute or property
    int income = 1000000;

    // static variable or static attribute or static property
    static int salary = 5000;

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    // static method or static member function
    static void diff(int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        AboutStatic obj = new AboutStatic();
//        obj.sum(10, 14);
//        obj.diff(90, 15);
        System.out.println(obj.income);

        System.out.println(salary);
        // diff(10, 5);
    }
}

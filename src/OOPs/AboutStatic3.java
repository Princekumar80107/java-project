package OOPs;

public class AboutStatic3 {
    static int num = 10; // static variables are declare for classes not for the object.
    int a = 20;

    public void fun() {
        System.out.println("Function");
    }

    public static void main(String[] args) {
//        System.out.println(num);
        AboutStatic3 obj1 = new AboutStatic3();
        AboutStatic3 obj2 = new AboutStatic3();

        obj1.num++;
        obj1.a++;
        System.out.println(obj1.num);
        System.out.println(obj1.a);

        System.out.println(obj2.num);
        System.out.println(obj2.a);
    }
}

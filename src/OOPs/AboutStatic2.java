package OOPs;

public class AboutStatic2 {

    int a = 10;
    static int b = 15;

    // you can only call static fun from static fun, you can't able to call non-static fun from static fun
    static void funHello() {
//        this.funCat();
        System.out.println("Hello World");
    }

    void funCat() {
        this.funHello();
        System.out.println("Cat");
    }

    public static void main(String[] args) {
        AboutStatic2 obj = new AboutStatic2();
        obj.funCat();
//        funCat(); // you can't call non-static fun from the static fun
    }
}

package OOPs.TypesOfClasses;

class StaticOuter {
    private String message = "Hello, World";
    static private String mess = "Hello, World";

    static class StaticInner {
        void print() {
            System.out.println(mess);
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        StaticOuter.StaticInner obj = new StaticOuter.StaticInner();
        obj.print();

    }
}

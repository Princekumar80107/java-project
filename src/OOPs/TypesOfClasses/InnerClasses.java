package OOPs.TypesOfClasses;

class Outer {
    private String message = "Hello, World";

    // a class inside another class is called inner class, they can access all the members of the outer class even the private ones.
    class Inner {
        void print() {
            System.out.println(message);
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner inner = obj.new Inner();

        inner.print();

    }
}

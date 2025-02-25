package OOPs.Polymorphism.CompileTime;

class Student {
    protected String name = "Prince";

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Parametrized Constructor");
    }
    protected void result() {
        System.out.println("Result of the Students Declared");
    }
}
public class AboutSuper extends Student {

    AboutSuper() {
        super("Kumar");
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        AboutSuper obj = new AboutSuper();
    }

}

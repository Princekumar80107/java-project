package OOPs.Inheritance;

import java.util.Objects;

public class AboutObjectClass {
    private String name;
    private int age;

    AboutObjectClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Name: ").append(name).append(", ").append("age = ").append(age);
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {
        AboutObjectClass o = (AboutObjectClass) obj;

        boolean check = (o.name == this.name) && (o.age == this.age);
        return check;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        AboutObjectClass obj1 = new AboutObjectClass("Prince", 23);
        AboutObjectClass obj2 = new AboutObjectClass("Prince", 23);
        AboutObjectClass obj3 = new AboutObjectClass("Kumar", 34);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());


        if(obj1.hashCode() == obj2.hashCode()) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}

package OOPs.Inheritance;

// Parent or Super Class
class Animal {
    protected String name;
    public void eat() {
        System.out.printf("%s is eating", name);
    }
}

// Child or Sub Class
class Dog extends Animal{
    public void bark() {
        System.out.printf("%s is barking", name);
    }
}

public class TestingInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "tiger";
        d.eat();
        d.bark();
    }
}

package OOPs.Polymorphism.CompileTime;

// Rules of Method Overriding
// 1. Same Method name as in the parent
// 2. Same arguments(Number of arguments and data type) in the method as in the parent
// 3. Inheritance
// 4. Return type should also need to same
// 5. Access of the method should not be more restricted in the child class
// 6. Method is not to be final and static in the parent, reason is we can't override final and static methods

class Person {
    void walk() {
        System.out.println("Person can walk");
    }
    static void eat() {
        System.out.println("Person can eat");
    }
}

public class MethodOverriding extends Person {

    @Override
    void walk() {
        System.out.println("Child can walk");
    }

    static void eat() {
        System.out.println("Child can eat");
    }

    // runtime polymorphism me memory kis type is assign kari gyi hai us par depend karta hia kiska function call hoga
    public static void main(String[] args) {

        Person obj1 = new MethodOverriding();
        MethodOverriding obj2 = new MethodOverriding();
        Person obj3 = new Person();

        obj1.eat();
        obj2.eat();
        obj3.eat();

        obj1.walk();
        obj2.walk();
        obj3.walk();
    }
}

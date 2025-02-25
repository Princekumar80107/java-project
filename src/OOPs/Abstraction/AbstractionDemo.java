package OOPs.Abstraction;


// abstract is a keyword
// 1. abstract class
// a. cannot make their object
// b. act as a base class for other classes

// 2. abstract method
// a. Has no implementation
// b. Must be declared by subclasses

abstract class Vehicle {
    abstract void start();
    final void something() {

    }
    void system() {

    }
}

class Honda extends Vehicle {

    @Override
    void start() {
        System.out.println("Car is starting with a key");
    }

}

public class AbstractionDemo {
    public static void main(String[] args) {
        Honda myCar = new Honda();
        myCar.start();
    }
}

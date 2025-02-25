package OOPs.Constructor;

public class Car {
    String brand;
    String model;

    // constructor is used to initialize the object (to initialize the attributes of the object)

    // default constructor
    Car() {
        System.out.println("Constructor Called");
    }

    // Parametrised constructor
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Parametrised Constructor");
    }



}

package OOPs.TypesOfClasses;

abstract class AnonymousExample {
    abstract void display();
    abstract void print();
}

abstract class Car {
    abstract void start();
    abstract void stop();
    abstract void speed();
}

class Honda extends Car {
    @Override
    void start() {
        System.out.println("wrooh wrooh");
    }

    @Override
    void stop() {

    }

    @Override
    void speed() {

    }
}

//class person extends AnonymousExample {
//    void display() {
//        System.out.println("Hello World");
//    }
//}

public class AnonymousClasses {
    public static void main(String[] args) {

        // Anonymous classes are used to implement the methods of the abstract classes without creating any other class
        AnonymousExample obj = new AnonymousExample() {
            @Override
            void display() {
                System.out.println("Hello World");
            }

            void print() {
                System.out.println("Hello Print");
            }
        };

        obj.display();
        obj.print();
    }
}

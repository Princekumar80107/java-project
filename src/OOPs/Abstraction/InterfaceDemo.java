package OOPs.Abstraction;

interface Animal {
    void makeSound();
    void running();
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    @Override
    public void running() {

    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}

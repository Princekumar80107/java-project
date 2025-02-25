package OOPs.Inheritance;

class Papa {
    public void hairColor() {
        System.out.println("Hair is black");
    }
}

class Mummy {
    public void hairColor() {
        System.out.println("Hair is Golder Brown");
    }
}

// ambiguity arise, java does not support multiple inheritance for classes, we can acheive this using interfaces
public class MultipleInheritance {
    public static void main(String[] args) {
//        Child c = new Child();
//        c.hairColor();
    }
}

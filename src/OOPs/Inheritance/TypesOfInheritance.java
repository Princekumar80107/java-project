package OOPs.Inheritance;

/*
Types of Inheritance
1. Simple
2. Multiple
3. Multi Level
4. Hierarchical
5. Hybrid
*/

// Multi Level Inheritance
class Grandfather {
    public void playChess() {
        System.out.println("Good in chess");
    }
}

class Father extends Grandfather{

    public void cricket() {
        System.out.println("Good in cricket");
    }
}

class Child extends Father {
    public void nalla() {
        System.out.println("Nalla");
    }
}


// Hierarchical Inheritance
class Person {
    protected String name;
    public void walk() {
        System.out.printf("%s can walk\n", name);
    }
    public void eat() {
        System.out.printf("%s can eat\n", name);
    }
}

class Student extends Person{
    public void giveExam() {
        System.out.printf("%s can give exam\n", name);
    }
    public void study() {
        System.out.printf("%s can study\n", name);
    }
}

class Teacher extends Person {
    public void teach() {
        System.out.printf("%s can teach\n", name);
    }
    public void beat() {
        System.out.printf("%s can beat\n", name);
    }
}

public class TypesOfInheritance {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Shukla";
        t.beat();
        t.teach();
        t.walk();
        t.eat();
    }
}

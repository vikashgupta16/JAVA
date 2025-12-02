package OOPs;

public class abstrac {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.greet();
        h1.sayHello();

        Cheeken c1 = new Cheeken();
        c1.greet();
        c1.sayHello();
    }
}

// abstract class
abstract class Parent {
    abstract void greet();

    void sayHello() {
        System.out.println("Hello");
    }
}

class Horse extends Parent {
    void greet() {
        System.out.println("Neigh");
    }
}

class Cheeken extends Parent {
    void greet() {
        System.out.println("Cluck");
    }
}
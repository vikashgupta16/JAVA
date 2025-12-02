package OOPs;

// Correct class name
public class inhertiance {
    public static void main(String[] args) {
        // Dog d1 = new Dog();
        // d1.bark();
        // d1.eat();   // inherited from Animal
        // d1.breathe(); // inherited from Animal
        Cat c1 = new Cat();
        c1.meow();
        c1.Breed = "Persian";
        System.out.println(c1.Breed);
        Calaulator calc = new Calaulator();
        System.out.println("Addition: " + calc.add(5, 10));
    }
}

// Base class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
    void breathe() {
        System.out.println("Breathing...");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
    void guard() {
        System.out.println("Guarding...");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("Flying...");
    }
}
class Cat extends Animal {
    String Breed;
    void meow() {
        System.out.println("Meowing...");
    }
}
class Calaulator{
    int add(int a, int b){
        return a+b;
    }
    int multiply(int a, int b){
        return a*b;
    }
}


//Single level inheritance-> base to derived class
//Multilevel inheritance-> base -> derived -> sub derived
//Hierarchical inheritance-> one base class and multiple derived classes
//Hybrid inheritance-> combination of two or more types of inheritance 
//Overriding-> same method name and same parameters in base and derived class
//super keyword-> to call the base class constructor and methods

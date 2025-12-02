package OOPs;

class Student {
    String name;
    int age;
    float marks;

    // Constructor
    Student(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to print student info
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}

public class const {
    public static void main(String[] args) {
        Student s1 = new Student("Vikash", 21, 88.5f);
        Student s2 = new Student("Ankit", 22, 78.5f);

        s1.printInfo();
        s2.printInfo();
    }
}

package OOPs;

class Student {
    String name;
    int age;
    float marks;

    // Parameterized Constructor
    Student(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.marks = s.marks;
    }

    // Method to print student info
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}

public class MainClass {   // better than using 'const'
    public static void main(String[] args) {
        Student s1 = new Student("Tanush", 15, 88.5f);
        Student s2 = new Student("Ankit", 22, 78.5f);

        // Using copy constructor
        Student s3 = new Student(s1);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();  // should print the same as s1
    }
}
// Time Complexity : O(1)
// Space Complexity : O(1)
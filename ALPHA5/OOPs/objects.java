package OOPs;

public class objects {
    public static void main(String[] args) {
        Pen p1= new Pen(); // created a pen object p1
        p1.setColor("Blue");
    }
}
class Pen{
    //Properties
    String color;
    int tip;
    //Functions
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void caclPercentage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;
    }
}

/*
Constructor: A constructor is a special method that is called when an object is instantiated. It is used to initialize the object's properties. A constructor has the same name as the class and does not have a return type.
    It can be parameterized to accept values for initializing the object's properties.

    Student s1 = new Student("Tanush");
    System.out.println(s1.name);
    Student s2 = new Student(45);
    


    Class Student{
    String name;
    int roll;
    Student(String name){
    this.name=name; //parametrsied
    System.out.print("Constructor is called");
     }

    Student(int roll){

    this.roll=roll;}
    
    }
*/
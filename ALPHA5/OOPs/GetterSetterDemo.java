package OOPs;

public class GetterSetterDemo {
    public static void main(String[] args) {

        Pen p1 = new Pen(); 
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        // Now use setter instead of direct access
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAccount b1 = new BankAccount();
        b1.setUsername("Vikash");
        b1.setPassword("abcd1234");
        b1.deposit(1000);
        System.out.println("Balance: " + b1.checkBalance());
    }
}


//Shalow copy constructor

//Deep copy constructor
//Loop to copy all the values from one object to another
//lasy copy
//copy the reference of one object to another
//Destructor-Garbage collector (Automatic memory management)
class Pen {
    // Properties should be private
    private String color;
    private int tip;

    // Setters
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }

    // Getters
    String getColor() {
        return color;
    }
    int getTip() {
        return tip;
    }
}

class BankAccount {
    String username;
    private String password;
    private int accountNo;
    private float balance;

    void deposit(float amount) {
        balance += amount;
    }

    boolean withdraw(float amount) {
        if(balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    float checkBalance() {
        return balance;
    }

    void setPassword(String newPassword) {
        password = newPassword;
    }

    void setUsername(String newUsername) {
        username = newUsername;
    }

    String getUsername() {
        return username;
    }
}

class Student {
    // private String name;
    // private int age;
    private float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3.0f; // fixed float division
    }

    float getPercentage() {
        return percentage;
    }
}

/*
Shallow & Deeep copy


 */
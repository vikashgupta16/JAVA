package String;

public class largest {
    public static void main(String[] args) {

        String Fruits[] = {"Apple", "Banana", "Mango", "Orange", "Pineapple"};
        String largestFruit = "";
        for (String fruit : Fruits) {
            if (fruit.length() > largestFruit.length()) {
                largestFruit = fruit;
            }
        }
        System.out.println("Largest fruit: " + largestFruit);
    }
}

   
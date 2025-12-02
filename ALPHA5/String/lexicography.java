package String;

public class lexicography {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "mango"};
        String smallest = words[0];
        String largest = words[0];
        for (String word : words) {
            if (word.compareToIgnoreCase(smallest) < 0) {
                smallest = word;
            }
            if (word.compareToIgnoreCase(largest) > 0) {
                largest = word;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}

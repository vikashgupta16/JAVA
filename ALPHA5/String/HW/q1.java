package String.HW;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++) {
            char currentChar = input.charAt(i);
            if("aeiou".indexOf(currentChar) != -1) {
                System.out.print(currentChar + " ");
                count++;
            }
        }
        System.out.println("\nTotal vowels: " + count);
        scanner.close();
    }
}

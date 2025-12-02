package String;

import java.util.Scanner;

public class strings {
    public static void main(String str) {
        for(int i=0;i<str.length();i++) {
            System.out.println("Character at index " + i + ": " + str.charAt(i));
        }
    }
    public static void main(String args[]) {
        String str = "Hello, World!";
        String str2= new String("HELOO !!");
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name;
        name=sc.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Concatenated String: " + str + " " + str2);
        System.out.println("Substring (0, 5): " + name.substring(0, 4));
        sc.close();
    }
}

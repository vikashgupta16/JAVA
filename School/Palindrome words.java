import java.util.*;
public class Palin_Words
{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String str = in.nextLine();
       str = str + " ";
       String word = "";
       int count=0;
       for (int i = 0; i <str.length(); i++) {
           char ch = str.charAt(i);
           if (ch == ' ') {
               boolean isPalin = true;
               for (int j = 0; j < word.length()/ 2; j++) {
                   if (word.charAt(j) != word.charAt(word.length() - 1 - j)) {
                       isPalin = false;
                       break;
                   }
               }
               if (isPalin){
                   System.out.println(word);
                   count++;
                }
                word = "";
           }
           else {
               word += ch;
           }
       }
       System.out.println("Palindrome Words are "+count);
    }
}

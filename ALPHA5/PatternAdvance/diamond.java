package PatternAdvance;
import java.util.*;
public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. Of Line: ");
        int n=sc.nextInt();
        //1st half
        for (int i = 1; i <= n; i++) {
            //spaces
            for(int k=0;k<n-i;k++){
                    System.out.print(" ");
                }
            //stars
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            //spaces
            for(int k=0;k<n-i;k++){
                    System.out.print(" ");
                }
            //stars
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        } 
        sc.close();  
    }
}

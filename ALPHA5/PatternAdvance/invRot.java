package PatternAdvance;

import java.util.Scanner;

public class invRot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. Of Line: ");
        int n=sc.nextInt();
        int sp=n-1;
        for (int i = 1; i <= n; i++) {
            for(int k=0;k<sp;k++){
                    System.out.print(" ");
                }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            sp--;
            System.out.println("");
        }
        sc.close();
    }
}

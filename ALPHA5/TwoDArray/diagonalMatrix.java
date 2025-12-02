package TwoDArray;
import java.util.*;
public class diagonalMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        // for(int i=0; i<n; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (i == j) {
        //             sum += arr[i][j];
        //         }
        //         else if (i + j == arr.length - 1) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            sum += arr[i][arr.length - 1 - i];
        }
        System.out.println("Sum of diagonal elements: " + sum);
        sc.close();
    }
}

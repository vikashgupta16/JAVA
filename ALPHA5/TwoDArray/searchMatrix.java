package TwoDArray;
import java.util.*;

public class searchMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element to search:");
        int target = sc.nextInt();

        int row = 0, col = n - 1;
        boolean found = false;

        while (row < n && col >= 0) {
            if (arr[row][col] == target) {
                found = true;
                System.out.println("Element found at: (" + row + ", " + col + ")");
                break;
            }
            if (arr[row][col] < target) {
                row++;   // move down
            } else {
                col--;   // move left
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}

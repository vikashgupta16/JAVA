package TwoDArray;
import java.util.*;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter columns: ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] spiral = new int[n][m]; // to store spiral pattern
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        int idx = 0; // index in original matrix (row-major order)

        // flatten matrix into a list (row-wise)
        int[] arr = new int[n * m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[idx++] = matrix[i][j];
            }
        }

        idx = 0;
        // fill spiral with given elements
        while (top <= bottom && left <= right) {
            // top row
            for (int i = left; i <= right; i++) {
                spiral[top][i] = arr[idx++];
            }
            top++;

            // right col
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = arr[idx++];
            }
            right--;

            // bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = arr[idx++];
                }
                bottom--;
            }

            // left col
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = arr[idx++];
                }
                left++;
            }
        }

        // print final spiral pattern
        System.out.println("Matrix in Spiral Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", spiral[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}

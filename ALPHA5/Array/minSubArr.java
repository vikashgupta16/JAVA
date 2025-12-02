package Array;

import java.util.Scanner;

public class minSubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max(arr);
        sc.close();
    }

    public static void max(int arr[]) {
        int curSum = 0, maxSum = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                curSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxSum > curSum) {
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Min Sum: " + maxSum);
    }
}

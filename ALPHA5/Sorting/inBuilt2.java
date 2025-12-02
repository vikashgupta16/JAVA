package Sorting;

import java.util.*;

public class inBuilt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Use Integer[] instead of int[]
        Integer arr[] = new Integer[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. Normal ascending sort
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));

        // 2. Sort a subarray (index 3 to 5 exclusive)
        if (n >= 5) { // prevent IndexOutOfBounds
            Arrays.sort(arr, 3, 5);
            System.out.println("Subarray sorted (3 to 5): " + Arrays.toString(arr));
        }

        // 3. Descending order sort
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(arr));

        sc.close();
    }
}

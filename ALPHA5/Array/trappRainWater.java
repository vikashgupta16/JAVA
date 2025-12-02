package Array;

import java.util.*;

public class trappRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of blocks you want: ");
        int n = sc.nextInt();
        
        if (n > 2) {
            int arr[] = new int[n];
            System.out.print("Enter Block sizes: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int trappedWater = trap(arr);
            if (trappedWater > 0) {
                System.out.println("Total trapped water: " + trappedWater);
            } else {
                System.out.println("Not possible, water will flow out...");
            }
        } else {
            System.out.println("NOT Possible to Trap Water in it");
        }

        sc.close();
    }

    // Function to calculate trapped water
    public static int trap(int arr[]) {
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        int water = 0;

        // Fill leftMax array
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Fill rightMax array
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Calculate trapped water
        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return water;
    }
}

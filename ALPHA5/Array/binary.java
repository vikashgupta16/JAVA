package Array;

import java.util.*;

public class binary {
    public static void sort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static int search(int arr[],int item) {
        int start=0,end=arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == item) {
                return mid; 
            } else if (arr[mid] < item) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter item to search: ");
        int item=sc.nextInt();
        sort(arr);
        System.out.println("Sorted array is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        int res=search(arr,item);
        if(res!=-1){
            System.out.println("Item Found at: "+res);
        }
        else{
            System.out.println("Item Not found");
        }
        sc.close();
    }
}

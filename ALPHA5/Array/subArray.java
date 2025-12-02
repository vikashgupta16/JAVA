package Array;
import java.util.*;
public class subArray {
    
    public static void subArr(int arr[]) {
        int tt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]);
                }
                tt++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total subarrays: "+tt);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subArr(arr);
        sc.close();
    }
}

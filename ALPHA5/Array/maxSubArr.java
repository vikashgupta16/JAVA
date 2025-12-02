package Array;

import java.util.Scanner;

public class maxSubArr {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   
        max(arr);
            sc.close();
    }
    public static void max(int arr[]) {
         int curSum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curSum=0;
                for(int k=i;k<=j;k++){
                    curSum += arr[k];
                }
                System.out.println("Current sum is: " + curSum);
                if(maxSum<curSum){
                    maxSum=curSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum: "+maxSum);
    }
}

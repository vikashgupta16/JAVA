package Array;

import java.util.Scanner;

public class kadane {
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
            curSum=curSum+arr[i];
            if(curSum<0){
                curSum=0;
            }
            maxSum=Math.max(curSum, maxSum);
        }
        System.out.println("Max Sum: "+maxSum);
    }
}

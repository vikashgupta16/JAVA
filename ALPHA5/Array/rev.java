package Array;
import java.util.*;
public class rev {
    public static void revE(int aum[]){
        int f=0,l=aum.length-1;
        while (f<l) {
            int temp=aum[l];
            aum[l]=aum[f];
            aum[f]=temp;
            f++;
            l--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elemets:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        revE(arr);
        System.out.println("The Reversed Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}

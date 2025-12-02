package Array;
import java.util.*;
public class linearSearch {
    public static int search(int arr[],int item) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item)
            return i; 
            else
            continue ;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("System.out.println: Enter Array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the item to search: ");
        int item=sc.nextInt();
        int index=search(arr,item);
        if (index!=1) {
            System.out.println("Item is at index: "+index);
        }
        else{
        System.out.println("Item not found");}
        sc.close();
    }
}

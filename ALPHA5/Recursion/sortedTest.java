package Recursion;

public class sortedTest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 4, 5, 6};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int arr[], int i) {
        //base case
        if (i == arr.length - 1) {
            return true;
        }
        //Working Model
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
    //TC = O(n)
    //SC = O(n) (auxiliary space)   
}
// --- IGNORE ---
//uphh break over
//uphh continue
//uphh step over
//uphh step in
//uphh step out
//uphh restart
//uphh stop
//uphh evaluate
//uphh print arr
//uphh print i
//uphh print arr[i]
//uphh print arr[i+1]
//uphh print isSorted(arr, i+1)
//uphh quit
//uphh help
//uphh where

//uphh bt
//uphh backtrace
//uphh info locals
//uphh info args
//uphh list
//uphh disassemble
//uphh frame
//uphh info break
//uphh clear
//uphh watch i
//uphh watch arr
//uphh watch arr[i]
//uphh watch arr[i+1]
//uphh watch isSorted(arr, i+1)
//uphh set var i=4
//uphh set var arr[4]=3

//uphh set var arr[4]=5
//uphh set var arr[4]=6

//uphh set var arr[4]=4
//uphh set var arr[4]=2
//uphh set var arr[4]=5
//uphh set var arr[4]=6
//uphh continue
//uphh quit
// --- IGNORE ---
//uphh break over



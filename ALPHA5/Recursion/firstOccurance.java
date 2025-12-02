package Recursion;

public class firstOccurance {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 5, 6};
        System.out.println(firstOcc(arr, 0, 2));
    }
    static int firstOcc(int arr[], int i, int key) {
        //base case
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, i + 1, key);
    }
    //TC = O(n)
    //SC = O(n) (auxiliary space)
}
//Output: 1
//Explanation: 2 is present at index 1 for the first time in the array.
//If 2 was not present in the array, then output would have been -1.

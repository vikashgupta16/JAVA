package DivideConquer;

public class mergeSort {
    public static void main(String[] args) {
        System.out.println("Hello from mergeSort");
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSot(arr, 0, arr.length - 1);
        printArr(arr);
    }
    //print array
    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //merge sort
    static void mergeSot(int arr[], int si, int ei) {
        //base case
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSot(arr, si, mid);
        mergeSot(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }
    //merge
    static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0; //iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
            }
            k++;
        }
        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}

package DivideConquer;

public class quic {
    public static void main(String[] args) {
        System.out.println("Hello from quic sort");
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //pivot -> rotaing around which array is divided
    //partition -> dividing array around pivot
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; //to track smaller element index
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i; //pivot index
    }
    public static void quickSort(int arr[], int si, int ei) {
        //base case
        if (si >= ei) {
            return;
        }
        //partition
        int pIdx = partition(arr, si, ei);
        //left part
        quickSort(arr, si, pIdx - 1);
        //right part
        quickSort(arr, pIdx + 1, ei);
    }
}
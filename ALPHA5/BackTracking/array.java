package BackTracking;
//Empty array with size: n =5
public class array {
    
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();        
    }
    public static void changeArray(int arr[], int i , int val){
        //Base Case
        if(i == arr.length){
            printArray(arr);
            return;
        }
        //Recursion
        arr[i] = val;
        changeArray(arr, i+1, val+1);
        arr[i] = arr[i] - 2; //Backtracking step
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr,0,1);
        printArray(arr);
    }
}


//nqueens
//Sudoku
//Grid Ways
// {Krna h}

package Array;

public class pair {
    public static void arrS(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int first = num[i];
            for (int j = i + 1; j < num.length; j++) {
                //int second = num[j]; // use j instead of i
                System.out.println("(" + first + "," + num[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 5, 6, 9, 2, 7};
        arrS(arr);
    }
}

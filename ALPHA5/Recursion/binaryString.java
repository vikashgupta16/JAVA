package Recursion;

public class binaryString {
    //printing without consecutive ones
    public static void main(String[] args) {
        int n = 5;
        printBinaryString(n, "");
    }
    static void printBinaryString(int n, String ans) {
        //base case
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        //choice
        //adding 0
        printBinaryString(n - 1, ans + "0");
        //adding 1 only when last digit is not 1
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != '1') {
            printBinaryString(n - 1, ans + "1");
        }
    }
}

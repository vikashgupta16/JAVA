package Recursion;

public class xpown {
    public static void main(String[] args) {
        System.out.println(xpow(2, 10));
    }
    static int xpow(int a, int b) {
        //base case
        if (b == 0) {
            return 1;
        }
        //working model
        if (b % 2 == 0) {
            return xpow(a, b / 2) * xpow(a, b / 2);
        } else {
            return a * xpow(a, b / 2) * xpow(a, b / 2);
        }
        //TC = O(log b)
        //SC = O(log b) (auxiliary space)
    }
}

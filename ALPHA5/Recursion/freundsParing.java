package Recursion;

public class freundsParing {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendspairing(n));
    }

    static int friendspairing(int n) {
        //base case
        if (n <= 2) {
            return n;
        }
        //choice
        //single
        // int fnm1 = friendspairing(n - 1);
        // //pair
        // int fnm2 = friendspairing(n - 2);
        // int pairways = (n - 1) * fnm2;

        int totalways = friendspairing(n - 1) + (n - 1) * friendspairing(n - 2);
        return totalways;
    }
}

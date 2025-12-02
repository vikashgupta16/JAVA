package Recursion;

public class tileLeecOde {
    //Tiling a Rectangle with the Fewest Squares
    //Given a rectangle of size n x m, return the minimum number of integer-sided squares that tile the rectangle.
    public static void main(String[] args) {
        System.out.println(tillingWays(2, 3));
    }
    static int tillingWays(int n, int m) {
        //base case
        if (n == m) {
            return 1;
        }
        if (n < m) {
            return tillingWays(m, n);
        }
        int min = Integer.MAX_VALUE;
        //vertical cut
        for (int i = 1; i <= m; i++) {
            min = Math.min(min, 1 + tillingWays(n - i, i) + tillingWays(n, m - i));
        }
        //horizontal cut
        for (int i = 1; i <= n; i++) {
            min = Math.min(min, 1 + tillingWays(n - i, m) + tillingWays(i, m - n));
        }
        return min;
        //TC = Exponential
        //SC = O(n) (auxiliary space)
    }
    //best timre complexity solution using memoization
    static int tillingWaysMem(int n, int m, int[][] dp) {
        //base case
        if (n == m) {
            return 1;
        }
        if (n < m) {
            return tillingWaysMem(m, n, dp);
        }
        if (dp[n][m] != 0) {
            return dp[n][m];
        }
        int min = Integer.MAX_VALUE;
        //vertical cut
        for (int i = 1; i <= m; i++) {
            min = Math.min(min, 1 + tillingWaysMem(n - i, i, dp) + tillingWaysMem(n, m - i, dp));
        }
        //horizontal cut
        for (int i = 1; i <= n; i++) {
            min = Math.min(min, 1 + tillingWaysMem(n - i, m, dp) + tillingWaysMem(i, m - n, dp));
        }
        dp[n][m] = min;
        return dp[n][m];
    }
    //TC = O(n^3)
    //SC = O(n^2) + O(n) (auxiliary space)
}

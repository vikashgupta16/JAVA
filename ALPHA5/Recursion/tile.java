package Recursion;

public class tile {
    //2xn tiling problem
    public static void main(String[] args) {
        System.out.println(tillingWays(2));
    }
    static int tillingWays(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }
        //vertical choice
        int fnm1 = tillingWays(n - 1);
        //horizontal choice 
        int fnm2 = tillingWays(n - 2);
        int totalWays = fnm1 + fnm2;
        //or return tillingWays(n-1) + tillingWays(n-2);
        //TC = O(2^n)
        //SC = O(n) (auxiliary space)
        return totalWays;
    }
    //tiling problem using memoization
    static int tillingWaysMem(int n, int[] dp) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }
        //check if already exist
        if (dp[n] != 0) {
            return dp[n];
        }
        //vertical choice
        int fnm1 = tillingWaysMem(n - 1, dp);
        //horizontal choice 
        int fnm2 = tillingWaysMem(n - 2, dp);
        dp[n] = fnm1 + fnm2;
        return dp[n];
    }
    //tiling problem using tabulation
    static int tillingWaysTab(int n) {
        int[] dp = new int[n + 1];
        //base case
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    //tiling problem using space optimization
    static int tillingWaysSO(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int a = 1; //dp[0]
        int b = 1; //dp[1]
        for (int i = 2; i <= n; i++) {
            int c = a + b; //dp[i] = dp[i-1] + dp[i-2]
            a = b;
            b = c;
        }
        return b; //dp[n]
    }
    //TC = O(n)
    //SC = O(1)
    //Time Complecty log(n) using matrix exponentiation
    //matrix exponentiation
    
}

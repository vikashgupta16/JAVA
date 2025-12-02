package BackTracking;

public class gridWays {
    public static int gridWay(int i, int j, int n, int m){
        //Base Case
        if(i == n-1 && j == m-1){
            return 1;
        }
        else if(i == n || j == m){
            return 0;
        }
        if(i >= n || j >= m){
            return 0;
        }
        //Recursion
        int downWays = gridWay(i+1, j, n, m);
        int rightWays = gridWay(i, j+1, n, m);
        return downWays + rightWays;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWay(0, 0, n, m));
    }
}
/*
Output:
6
*/
/* 
Examples: 
Input: n = 3, m = 3
Output: 6
Explanation: From the top-left corner (0, 0) to the bottom-right corner (
2, 2), there are a total of 6 unique paths:
1. Right -> Right -> Down -> Down
2. Right -> Down -> Right -> Down
3. Right -> Down -> Down -> Right
4. Down -> Right -> Right -> Down
5. Down -> Right -> Down -> Right
6. Down -> Down -> Right -> Right
*/
//Time Complexity: O(2^(n+m))
//Space Complexity: O(n+m) (recursion stack space)


//Leetcode: https://leetcode.com/problems/unique-paths/
//GFG: https://practice.geeksforgeeks.org/problems/number-of-unique-paths5339/1
//Striver SDE Sheet: https://takeuforward.org/data-structure/number-of-unique-paths-dp-5/
//CodeStudio: https://www.codingninjas.com/codestudio/problems/number-of-unique-paths_1081470

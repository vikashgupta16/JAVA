package Array;
import java.util.*;

public class buySellStock {
    public static int buyAndSellStock(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter price list:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        
        int result = buyAndSellStock(arr);  // store the returned profit
        System.out.println("Maximum Profit: " + result);

        sc.close();   
    }
}

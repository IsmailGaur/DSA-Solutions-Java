import java.util.*;

public class BuyAndSellStocks {
    public static int ReturnProfit(int arr[]) {
        int n = arr.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            if (buyPrice < arr[i]) {
                int Profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, Profit);
            } else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 12, 43, 19, 32, 65 };
        System.out.println(ReturnProfit(arr));
    }
}

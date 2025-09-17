import java.util.*;

public class MaxSubarray {
    public static int ReturnValue(int arr[], int k) {
        int n = arr.length;
        int j = k;
        int CurrSum = 0;
        int MaxSum = 0;
        for (int i = 0; i < k; i++) {
            CurrSum += arr[i];
            MaxSum = CurrSum;
        }

        for (int i = k; i < n; i++) {
            CurrSum = CurrSum + arr[i] - arr[i - k];
            MaxSum = Math.max(CurrSum, MaxSum);
        }
        return MaxSum;

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 1, 4, 5, 2, 16, 8, 1, 3, 2, 7 };
        int k = 3;
        System.out.println(ReturnValue(arr, k));
    }
}
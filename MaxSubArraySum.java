import java.util.*;

public class MaxSubArraySum {
    public static int ReturnSum(int arr[]) {
        int n = arr.length;
        int currSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, 9, -3, 2, 1, 4, -4 };
        System.out.println(ReturnSum(arr));
    }

}

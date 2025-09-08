import java.util.*;

public class TwoIntegerSum {
    public static int[] ReturnIndex(int arr[], int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[] { arr[left], arr[right] };
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 23, 25, 13, 43, 12 };
        int target = 48;
        System.out.println(Arrays.toString(ReturnIndex(arr, target)));
    }

}

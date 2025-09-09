import java.util.*;

public class RotateArray {
    public static int[] ReturnArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        return arr;
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 0, -1, -5, 43, 12, 41 };
        int k = 2;
        System.out.println(Arrays.toString(ReturnArray(arr, k)));
    }

}

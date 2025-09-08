import java.util.*;

public class RemoveElements {
    public static int ReturnValue(int arr[], int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != target) {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 2, 1, 2, 5, 4 };
        int target = 2;
        System.out.println(ReturnValue(arr, target));
    }

}

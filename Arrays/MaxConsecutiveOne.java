import java.util.*;

public class MaxConsecutiveOne {
    public static int ReturnCount(int arr[]) {
        int n = arr.length;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count += 1;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }

        }
        return maxCount;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 0, 1, 1, 1 };
        System.out.println(ReturnCount(arr));

    }

}

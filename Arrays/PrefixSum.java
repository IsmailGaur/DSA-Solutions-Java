import java.util.*;

public class PrefixSum {
    public static int[] ReturnValue(int arr[]) {
        int n = arr.length;
        int Prefix_sum[] = new int[n];
        Prefix_sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            Prefix_sum[i] = Prefix_sum[i - 1] + arr[i];

        }
        return Prefix_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 1, 6, 8, 7 };
        System.out.println(Arrays.toString(ReturnValue(arr)));
    }

}

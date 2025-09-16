import java.util.*;

public class SuffixSum {
    public static int[] ReturnSum(int arr[]) {
        int n = arr.length;
        int Suffix_sum[] = new int[n];
        Suffix_sum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Suffix_sum[i] = Suffix_sum[i + 1] + arr[i];
        }
        return Suffix_sum;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 7, 1, 3 };
        System.out.println(Arrays.toString(ReturnSum(arr)));

    }

}

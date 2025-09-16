
import java.util.*;

public class SumDiffrence {
    public static int[] ReturnValue(int arr[]) {
        int n = arr.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        int answer[] = new int[n];

        leftSum[0] = 0;
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + arr[i - 1];
        }
        rightSum[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 1, 9, 6 };
        System.out.println(Arrays.toString(ReturnValue(arr)));

    }

}

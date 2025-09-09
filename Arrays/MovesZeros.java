import java.util.*;

public class MovesZeros {
    public static int[] ReturnArray(int arr[]) {
        int n = arr.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (arr[right] != 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 3, 4, 0, 6, 31, 0 };
        System.out.println(Arrays.toString(ReturnArray(arr)));

    }

}

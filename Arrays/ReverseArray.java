import java.util.Arrays;

public class ReverseArray {
    public static int[] Reverse_arr(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 32, 21, 34, 43, 124, 53, 212 };
        System.out.println(Arrays.toString(Reverse_arr(arr)));
    }

}

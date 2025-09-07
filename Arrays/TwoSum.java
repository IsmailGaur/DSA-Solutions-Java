import java.util.*;

public class TwoSum {
    public static int[] ReturnIndex(int arr[], int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int Left = 0;
        int Right = n - 1;

        while (Left < Right) {
            int Sum = arr[Left] + arr[Right];
            if (Sum == target) {
                System.out.println(arr[Left] + arr[Right]);
                return new int[] { Left, Right };
            } else if (target < Sum) {
                Right--;
            } else {
                Left++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 6;
        int result[] = ReturnIndex(arr, target);
        if (result != ReturnIndex(arr, target)) {
            System.out.print(result[0] + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }

}

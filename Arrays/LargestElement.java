import java.util.*;

public class LargestElement {
    public static int LargestValue(int arr[]) {

        ////Simple approach
        // int n = arr.length;
        // Arrays.sort(arr);
        // for (int i = n - 1; i > 0; i--) {
        // if (arr[i] != arr[i - 1]) {
        // return arr[i];
        // }
        // }
        // return -1;
        // }

        // optimize approach
        int n = arr.length;
        int Largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
                return Largest;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 8, 6, 43, 23, 24, 56 };
        System.out.println(LargestValue(arr));
    }

}

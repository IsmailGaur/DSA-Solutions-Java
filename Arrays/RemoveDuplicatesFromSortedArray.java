import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static int returnValues(int arr[]) {
        int n = arr.length;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 5, 5, 6, 6, 7 };
        System.out.println(returnValues(arr));
    }

}

import java.util.*;

public class DistinctElements {
    public static void returnArr(int arr[]) {
        Set<Integer> set = new HashSet<>();

        int n = arr.length;
        // int result[] = new int[n];
        for (int i = 1; i < n; i++) {
            // if (arr[i] != arr[i - 1]) {
            set.add(arr[i]);
        }
        System.out.print("Distinct elements are: ");
        for (int num : set) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 1, 3, 7, 6, 2 };
        returnArr(arr);
    }

}

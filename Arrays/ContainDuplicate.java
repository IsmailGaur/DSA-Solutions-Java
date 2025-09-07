import java.util.*;

public class ContainDuplicate {
    public static boolean IsDuplicate(int arr[]) {
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        Arrays.sort(arr);
        for (int i : arr) {
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
        // Brute Force approach
        // for (int i = 1; i < n; i++) {
        // if (arr[i] == arr[i - 1]) {
        // return true;
        // }
        // }
        // return false;
        //
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3,2 };
        System.out.println(IsDuplicate(arr));

    }

}

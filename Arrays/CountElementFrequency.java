import java.util.*;

public class CountElementFrequency {
    public static void ReturnCount(int arr[]) {
        // Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int count = 1;
        // for (int i = 0; i < n; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }
        // for (int key : map.keySet()) {
        // System.out.println(key + " occure" + map.get(key) + " times");
        // }
        // }
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " --" + count);
                count = 1;
            }
        }
        System.out.println(arr[n - 1] + " --" + count);
    }

    // count += arr[i];
    // count++;
    // }
    // }
    // return count;

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 4, 5, 4, 2, 7 };
        ReturnCount(arr);

    }

}

import java.util.*;
import java.util.stream.Gatherer.Integrator;

public class SecondLargest {
    public static int GetValue(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);

        int Largest = Integer.MIN_VALUE;
        int SecondLargestValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > Largest) {
                SecondLargestValue = Largest;
                Largest = arr[i];

            } else if (arr[i] > SecondLargestValue && arr[i] != Largest) {
                SecondLargestValue = arr[i];
            }
        }
        return SecondLargestValue;
    }

    public static void main(String[] args) {
        int arr[] = { 21, 31, 12, 32, 43, 23 };
        System.out.println(GetValue(arr));

    }
}

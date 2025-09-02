import java.util.Arrays;

public class BinarySearch {
    public static int Value(int arr[], int target) {
        int n = arr.length;
        Arrays.sort(arr);

        int startPoint = 0;
        int endPoint = n - 1;

        while (startPoint <= endPoint) {
            int midPoint = (startPoint + endPoint) / 2;
            if (arr[midPoint] == target) {
                return midPoint;
            }
            if (arr[midPoint] < target) {
                startPoint = midPoint + 1;
            } else {
                endPoint = midPoint - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 43, 21, 434, 67, 57, 432 };
        int target = 57;
        System.out.println("target is on index:  " + Value(arr, target));
    }

}

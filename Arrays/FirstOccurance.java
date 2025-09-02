
public class FirstOccurance {
    public static int IsTarget(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 0 };
        int target = 7;
        System.out.println(IsTarget(arr, target));
    }
}
public class BinarySearch {
    public static int FindTarget(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 54, 23, 13, 56, 43, 13, 21 };
        int target = 54;
        System.out.println(FindTarget(arr, target));
    }

}

public class LastOccurance {
    public static int FindLast(int arr[], int target) {
        int n = arr.length;
        int lastIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 1, 34, 5, 4, 3, 1 };
        int target = 1;
        System.out.println(FindLast(arr, target));
    }

}

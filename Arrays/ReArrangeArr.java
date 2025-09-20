import java.util.*;

class ReArrangeArr {
    public static int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num > 0)
                pos.add(num);
            else
                neg.add(num);
        }

        int n = nums.length;
        int[] result = new int[n];
        int i = 0, j = 0, k = 0;

        while (i < pos.size() && j < neg.size()) {
            result[k++] = pos.get(i++);
            result[k++] = neg.get(j++);
        }

        while (i < pos.size()) {
            result[k++] = pos.get(i++);
        }
        while (j < neg.size()) {
            result[k++] = neg.get(j++);
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 2, -3, 4, -12, 43, -543, 21 };
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
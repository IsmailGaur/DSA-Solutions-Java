public class MaxSubarrayProduct {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];

        for (int i = 1; i < n; i++) {
            int curr = nums[i];

            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);

            ans = Math.max(ans, maxProd);
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, -3, 4, -1 };
        System.out.println(maxProduct(nums));
    }
}

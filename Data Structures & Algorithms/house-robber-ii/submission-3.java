class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(algorithm(nums, 0, n - 2), algorithm(nums, 1, n - 1));
    }

    private int algorithm(int[] nums, int start, int end) {
        int n = end - start + 1;
        int[] result = new int[n];

        result[0] = nums[start];
        result[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < n; i++) {
            result[i] = Math.max(result[i - 1], nums[start + i] + result[i - 2]);
        }

        return result[n - 1];
    }
}

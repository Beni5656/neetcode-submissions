class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];

        return Math.max(algorithm(nums, 0, len - 2), algorithm(nums, 1, len - 1));
    }

    private int algorithm(int[] nums, int start, int end) {
        if (start > end) return 0;
        if (start == end) return nums[start];

        int[] dp = new int[end - start + 1];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < end - start + 1; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i + start] + dp[i - 2]);
        }

        return dp[end - start];
    }
}

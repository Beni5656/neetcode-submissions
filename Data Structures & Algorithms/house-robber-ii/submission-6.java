class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        return Math.max(calculate(nums, 0, nums.length - 2), calculate(nums, 1, nums.length - 1));
    }

    private int calculate(int[] nums, int start, int end) {
        int[] array = new int[end - start + 1];

        array[0] = nums[start];
        array[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < end - start + 1; i++) {
            array[i] = Math.max(array[i - 2] + nums[start + i], array[i - 1]);
        }

        return array[end - start];
    }
}

class Solution {
    public int rob(int[] nums) {
        int[] array = new int[nums.length];

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        array[0] = nums[0];
        array[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            array[i] = Math.max(array[i - 2] + nums[i], array[i - 1]);
        }

        return Math.max(array[nums.length - 1], array[nums.length - 2]);
    }
}

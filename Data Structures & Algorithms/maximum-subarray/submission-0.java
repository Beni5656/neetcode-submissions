class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }

            currentSum += nums[i];

            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }
}

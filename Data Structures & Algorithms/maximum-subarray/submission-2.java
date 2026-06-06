class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currSum < 0) {
                currSum = 0;
            }

            currSum += nums[i];

            maxSoFar = Math.max(currSum, maxSoFar);
        }

        return maxSoFar;
    }
}

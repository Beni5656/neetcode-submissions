class Solution {
    public int maxSubArray(int[] nums) {
        int maxResult = Integer.MIN_VALUE;
        int currResult = 0;

        for (int num: nums) {
            currResult += num;
            maxResult = Math.max(maxResult, currResult);

            if (currResult < 0) {
                currResult = 0;
            }
        }

        return maxResult;
    }
}

class Solution {
    public int jump(int[] nums) {
        int farthest = 0;
        int curr = 0;
        int jumpCount = 0;

        if (nums.length == 1  || nums.length == 0) {
            return 0;
        }
        
        for (int i = 0; i < nums.length; i++) {
            curr = Math.max(curr, nums[i] + i);

            if (i == farthest) {
                jumpCount++;
                farthest = curr;
            }

            if (farthest >= nums.length - 1) {
                return jumpCount;
            }
        }

        return jumpCount;
    }
}

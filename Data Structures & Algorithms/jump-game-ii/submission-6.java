class Solution {
    public int jump(int[] nums) {
        int farthest = 0;
        int currJumps = 0;
        int maxRange = 0;

        for (int i = 0; i < nums.length; i++) {
            maxRange = Math.max(maxRange, i + nums[i]);

            if (farthest == i && i != nums.length - 1) {
                currJumps++;
                farthest = maxRange;
            }
        }

        return currJumps;
    }
}

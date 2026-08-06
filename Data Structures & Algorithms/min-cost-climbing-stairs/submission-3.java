class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] array = new int[cost.length];

        array[0] = cost[0];
        array[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            array[i] = cost[i] + Math.min(array[i - 2], array[i - 1]);
        }

        return Math.min(array[cost.length - 2], array[cost.length - 1]);
    }
}


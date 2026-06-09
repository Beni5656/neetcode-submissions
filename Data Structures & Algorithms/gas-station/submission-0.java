class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        
        for (int g: gas) {
            sum += g;
        }

        for (int c: cost) {
            sum -= c;
        }

        if (sum < 0) return -1;

        int currSum = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            currSum += (gas[i] - cost[i]);

            if (currSum < 0) {
                start = i + 1;
                currSum = 0;
            }
        }

        return start;
    }
}

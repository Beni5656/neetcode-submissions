class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
        }

        if (total < 0) {
            return -1;
        }

        int station = 0;
        int result = 0;

        for (int i = 0; i < gas.length; i++) {
            result += gas[i] - cost[i];

            if (result < 0) {
                station = i + 1;
                result = 0;
            }
        }

        return station;
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;

        for (int c: cost) {
            totalCost += c;
        }

        for (int g: gas) {
            totalGas += g;
        }

        if (totalCost > totalGas) return -1;

        int currentTank = 0;
        int station = 0;

        for (int i = 0; i < gas.length; i++) {
             currentTank += gas[i] - cost[i];

             if (currentTank < 0) {
                station = i + 1;
                currentTank = 0;
             }
        }

        return station;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] array = new double[position.length][2];

        for (int i = 0; i < position.length; i++) {
            array[i][0] = position[i];
            array[i][1] = (target - position[i]) / (double) speed[i];
        }

        Arrays.sort(array, (a, b) -> Double.compare(a[0], b[0]));

        int result = 0;
        double currTime = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (i != array.length - 1 && array[i][1] <= currTime) {
                continue;
            }

            result++;
            currTime = array[i][1];
        }

        return result;
    }
}

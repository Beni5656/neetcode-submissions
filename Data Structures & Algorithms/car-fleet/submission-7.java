class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        double[][] car = new double[n][2];

        for (int i = 0; i < n; i++) {
            car[i][0] = position[i];
            car[i][1] = (double) (target - position[i]) / speed[i];
        }

        Arrays.sort(car, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || car[i][1] > stack.peek()) {
                stack.push(car[i][1]);
            }
        }

        return stack.size();
    }
}

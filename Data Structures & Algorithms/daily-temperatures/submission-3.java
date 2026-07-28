class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                int[] first = stack.pop();
                result[first[1]] = i - first[1];
            }
            
            int[] temp = new int[2];
            temp[0] = temperatures[i];
            temp[1] = i;
            stack.push(temp);
        }

        return result;
    }
}

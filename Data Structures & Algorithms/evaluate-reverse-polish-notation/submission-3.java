class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        Set<String> set = new HashSet<>(); 

        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");

        for (String token: tokens) {
            if (!set.contains(token)) {
                stack.push(Integer.parseInt(token));
                continue;
            }

            int second = stack.pop();
            int first = stack.pop();

            if (token.equals("+")) stack.push(first + second);
            if (token.equals("-")) stack.push(first - second);
            if (token.equals("*")) stack.push(first * second);
            if (token.equals("/")) stack.push(first / second);
        }

        return stack.peek();
    }
}

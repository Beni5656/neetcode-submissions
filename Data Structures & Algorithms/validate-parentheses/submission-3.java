class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c: s.toCharArray()) {
            if (c.equals('(') || c.equals('{') || c.equals('[')) {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) return false;
            
            char top = stack.pop();

            if (c.equals(')') && top != '(') return false;
            if (c.equals('}') && top != '{') return false;
            if (c.equals(']') && top != '[') return false;
        }

        return stack.isEmpty();
    }
}

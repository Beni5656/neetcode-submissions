class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.keySet().contains(s.charAt(i))) {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.isEmpty() || map.get(stack.pop()) != s.charAt(i)) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}

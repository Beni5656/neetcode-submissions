class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        backtrack(result, n, 0, 0, "");
        return result;
    }

    private void backtrack(List<String> result, int n, int open, int close, String current) {
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        if (open < n) {
            backtrack(result, n, open + 1, close, current + "(");
        }

        if (close < open) {
            backtrack(result, n, open, close + 1, current + ")");
        }
    }
}


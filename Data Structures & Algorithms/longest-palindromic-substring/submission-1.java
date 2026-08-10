class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int even = validate(s, i, i + 1);
            int odd = validate(s, i, i);

            int len = Math.max(even, odd);

            if (len > maxLength) {
                maxLength = len;
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    private int validate(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int left = 0;
        int longest = 1;
        Set<Character> unique = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (unique.contains(currentChar)) {
                unique.remove(s.charAt(left));
                left++;
            }

            unique.add(currentChar);

            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}
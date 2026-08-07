class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxSeq = 0;

        for (int right = 0; right < s.length(); right++) {
            Character ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            maxSeq = Math.max(maxSeq, right - left + 1);
        }

        return maxSeq;
    }
}
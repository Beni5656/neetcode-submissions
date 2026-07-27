class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxSeq = 1;

        if (s.length() == 0) {
            return 0;
        }
        set.add(s.charAt(left));

        for (int right = 1; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxSeq = Math.max(maxSeq, right - left + 1);
        }

        return maxSeq;
    }
}
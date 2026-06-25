class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        
        int maxSeq = 0;

        int left = 0;
        int right = 0;

        if (s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }
        
        set.add(s.charAt(left));

        while (right < s.length() - 1) {
            right++;

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
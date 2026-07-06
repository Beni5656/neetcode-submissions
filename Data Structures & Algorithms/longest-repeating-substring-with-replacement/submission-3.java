class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int maxLength = 0;
        int maxFreq = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            maxFreq = Math.max(map.get(rightChar), maxFreq);

            if (right - left + 1 - maxFreq > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

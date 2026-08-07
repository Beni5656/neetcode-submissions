class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxSeq = 0;
        int maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            Character ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while ((right - left + 1 - maxFreq) > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }

            maxSeq = Math.max(right - left + 1, maxSeq);
        }

        return maxSeq;
    }
}

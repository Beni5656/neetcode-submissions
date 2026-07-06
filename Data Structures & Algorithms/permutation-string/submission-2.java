class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1count = new int[26];
        int[] s2count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1count[s1.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            s2count[s2.charAt(right) - 'a']++;

            if (right - left + 1 > s1.length()) {
                s2count[s2.charAt(left) - 'a']--;
                left++;
            }
            
            if (Arrays.equals(s1count, s2count)) {
                return true;
            }
        }

        return false;
    }
}

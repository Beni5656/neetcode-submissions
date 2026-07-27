class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Array[s1.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            s2Array[s2.charAt(right) - 'a']++;

            while ((right - left + 1) > s1.length()) {
                s2Array[s2.charAt(left) - 'a']--;
                left++;
            }

            if (Arrays.equals(s2Array, s1Array)) return true;
        }

        return false;
    }
}

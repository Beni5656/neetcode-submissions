class Solution {
    public boolean isAnagram(String s, String t) {
        int[] str1 = new int[26];
        int[] str2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            str1[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            str2[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(str1, str2);
    }
}

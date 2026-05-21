class Solution {
    public boolean isPalindrome(String s) {
        String modifiedS = s.replaceAll("[^0-9A-Za-z]", "").toLowerCase();
        int left = 0;
        int right = modifiedS.length() - 1;

        while (left < right) {
            if (modifiedS.charAt(left) != modifiedS.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}

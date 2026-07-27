class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        if (s.length() == 1 || s.length() == 0) return true;
        
        while (left <= right) {
            while (!Character.isLetterOrDigit(s.charAt(left))) {
                if (left == s.length() - 1) {
                    return true;
                }
                left++;
            }

            while (!Character.isLetterOrDigit(s.charAt(right))) {
                if (right == 0) {
                    return true;
                }
                right--;
            }

            if (Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

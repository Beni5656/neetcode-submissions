class Solution {
    public int findMin(int[] nums) {
        int length = nums.length - 1;
        int left = 0;
        int right = length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[length]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[right];
    }
}

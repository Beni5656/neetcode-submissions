class Solution {
    public int maxArea(int[] heights) {
        int maxVolume = 0;
        int currVolume = 0;

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            currVolume = Math.min(heights[left], heights[right]) * (right - left);
            maxVolume = Math.max(currVolume, maxVolume);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxVolume;
    }
}

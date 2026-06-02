class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxVolume = 0;

        while (left < right) {
            int currVolume = (right - left) * Math.min(heights[left], heights[right]);

            if (currVolume > maxVolume) {
                maxVolume = currVolume;
            }

            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxVolume;
    }
}

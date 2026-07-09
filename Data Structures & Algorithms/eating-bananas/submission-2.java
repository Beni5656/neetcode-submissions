class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int num: piles) {
            right = Math.max(right, num);
        }
        
        int result = right;

        while (left <= right) {
            int midSpeed = left + (right - left) / 2;

            if (canFinish(piles, h, midSpeed)) {
                right = midSpeed - 1;
                result = midSpeed;
            } else {
                left = midSpeed + 1;
            }
        }
        return result;
    }
        private boolean canFinish(int[] piles, int h, int speed) {
            int totalHours = 0;

            for (int num: piles) {
                totalHours += (num + speed - 1) / speed;
            }

            return totalHours <= h;
        }
}

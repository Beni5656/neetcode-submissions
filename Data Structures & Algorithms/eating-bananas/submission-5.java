class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        int result = 0;

        for (int pile: piles) {
            right = Math.max(right, pile);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canFinish(piles, h, mid)) {
                right = mid - 1;
                result = mid;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private boolean canFinish(int[] piles, int h, int speed) {
        int totalHours = 0;

        for (int pile: piles) {
            totalHours += (pile + speed - 1) / speed;
        }

        return totalHours <= h;
    }
}

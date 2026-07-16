class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;

        for (int pile: piles) {
            right = Math.max(right, pile);
        }

        int result = right;

        while (left <= right) {
            int midSpeed = left + (right - left) / 2;

            if (canFinish(piles, h, midSpeed)) {
                result = midSpeed;
                right = midSpeed - 1;
            } else {
                left = midSpeed + 1;
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

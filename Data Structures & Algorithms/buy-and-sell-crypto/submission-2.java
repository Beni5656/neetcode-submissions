class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int maxProfit = 0;

        for (int right = 0; right < prices.length; right++) {
            if (prices[left] > prices[right]) {
                left = right;
                continue;
            }

            maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
        }

        return maxProfit;
    }
}

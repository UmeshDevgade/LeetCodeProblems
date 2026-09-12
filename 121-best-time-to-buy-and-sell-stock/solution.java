// 3 ms | 94.2 MB
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Best price at which we could have bought
            minPrice = Math.min(minPrice, prices[i]);

            // Profit if we sell today
            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;

    }
}
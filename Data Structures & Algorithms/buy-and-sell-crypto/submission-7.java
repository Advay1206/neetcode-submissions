class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int profit = 0;
        int minBuy = prices[l];
        for (int r = 0; r < prices.length; r++){
            // prices[r] = selling price
            minBuy = Math.min(minBuy, prices[r]);
            profit = Math.max(profit, prices[r] - minBuy);
        }
        return profit;
    }
}

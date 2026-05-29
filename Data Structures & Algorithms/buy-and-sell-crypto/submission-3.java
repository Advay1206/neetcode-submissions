class Solution {
    public int maxProfit(int[] prices) {
        // need to find the minimum buy 
        // and keep track of the max profit.

        int minBuy = prices[0];
        int maxProfit = 0;

        for(int sell : prices){
            minBuy = Math.min(sell, minBuy);
            maxProfit = Math.max(maxProfit, sell - minBuy);
        }

        return maxProfit;
    }
}

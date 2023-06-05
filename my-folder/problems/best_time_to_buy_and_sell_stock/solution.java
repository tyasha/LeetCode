class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                minPrice = prices[i];
                continue;
            }

            if (prices[i] > minPrice) {
                if (prices[i] - minPrice > maxProfit) {
                    maxProfit = prices[i] - minPrice;
                }
            } else {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
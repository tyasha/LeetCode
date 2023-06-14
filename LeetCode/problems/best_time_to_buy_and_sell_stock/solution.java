class Solution {
    public int maxProfit(int[] prices) {
       int minPrice = prices[0];
       int maxProfit = 0;

       for(int i = 1; i < prices.length; i++) {
           if(minPrice > prices[i]) {
             minPrice = prices[i];
           } else {
               int currentProfit = prices[i] - minPrice;
               maxProfit = Math.max(maxProfit, currentProfit);
           }
       }

       return maxProfit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i<prices.length - 1; i++){
            if(prices[i] > min && prices[i + 1] < prices[i]){
                max = prices[i];
                profit += max - min;
                min = Integer.MAX_VALUE;
            } else if(prices[i] < min){
                min = prices[i];
            }
        }
        if(min < prices[prices.length-1]){
            profit += prices[prices.length - 1] - min;
        }
        return profit;
    }
}

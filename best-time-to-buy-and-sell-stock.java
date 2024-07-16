class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=Integer.MAX_VALUE;
        int maxsum=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buyprice){
                int sum = prices[i] - buyprice;
                maxsum = Math.max(sum,maxsum);
            } else {
                buyprice=prices[i];
            }
        }
        return maxsum;
        
    }
}

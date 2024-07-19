class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(k == 1 && cardPoints.length > 1){
            return Math.max(cardPoints[0], cardPoints[cardPoints.length - 1]);
        } 
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=cardPoints.length - k;i<cardPoints.length;i++){
            sum += cardPoints[i];
        }
        if(k == cardPoints.length){
            return sum;
        }
        maxsum = sum;
        int start = cardPoints.length - k + 1;
        int end = 0;
        while(end != k){
            if(start == cardPoints.length){
                start = 0;
                sum = sum - cardPoints[cardPoints.length - 1] + cardPoints[end];
            } else {
                sum = sum - cardPoints[start-1] + cardPoints[end];
            }
            start++;
            end++;
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum;
    }
}

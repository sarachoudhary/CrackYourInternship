class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end = height.length-1;
        int maxwater = Integer.MIN_VALUE;
        while(start<end){
            int sum = Math.min(height[start],height[end])*(end-start);
            maxwater = Math.max(maxwater,sum);
            if(height[end]<height[start]){
                end--;
            } else {
                start++;
            }
        } return maxwater;
        
    }
}

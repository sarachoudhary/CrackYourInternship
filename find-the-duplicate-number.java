class Solution {
    public int findDuplicate(int[] nums) {
        int n = 0;
        for(int i=0;i<nums.length;i++){
            n = Math.abs(nums[i]);
            if(nums[n-1] < 1){
                return n;
            } else {
                nums[n-1] *= -1;
            }
        }
        return -1;
    }
}

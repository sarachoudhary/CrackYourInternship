class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total = Math.abs(nums[i]);
            if(nums[total - 1] < 0){
                ans.add(total);
            } else {
                nums[total - 1] *= -1;
            }
        }
        return ans;
    }
}

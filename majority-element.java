class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int count = 1;
        int element = nums[0];
        int maxcount = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            } else {
                if(count > maxcount){
                    maxcount = count;
                    element = nums[i-1];
                }
                count = 1;
            }
        }
        if(count > maxcount){
            maxcount = count;
            element = nums[nums.length - 1];
        }

        return element;

    }
}

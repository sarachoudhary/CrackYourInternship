class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           hm.put(i,nums[i]);
        }
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length-1;
        while(s<e){
            if(nums[s]+nums[e]== target){
                break;
            } else if(nums[s]+nums[e]>target){
                e--;
            } else {
                s++;
            }
        }
        int[] ans = new int[2];
        Arrays.fill(ans,-1);
        for (Iterator<Integer> it = hm.keySet().iterator(); it.hasNext();) {
            Integer key = it.next();
            if (ans[0] == -1 && hm.get(key) == nums[s]) {
                ans[0] = key;
                it.remove(); // Use iterator to remove the element safely
            } else if (ans[1] == -1 && hm.get(key) == nums[e]) {
                ans[1] = key;
                it.remove();
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}

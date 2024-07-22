class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int sum = 0;
        int ans = 0;
        int rem = 0;
        count.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            rem = sum % k;
            if(rem < 0){
                rem += k;
            }
            ans += count.getOrDefault(rem, 0);
            count.put(rem, count.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}

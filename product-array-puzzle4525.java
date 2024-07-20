class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long product = 1;
        int zero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zero ++;
            } else {
                product *= nums[i];
            }
        }
        
        long ans[] = new long[nums.length];
        if(zero > 1){
            return ans;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                ans[i] = product;
            }else if(nums[i] != 0 && zero == 1){
                ans[i] = 0;
            } else {
                ans[i] = product/nums[i];
            }
        }
        return ans;
	} 
} 

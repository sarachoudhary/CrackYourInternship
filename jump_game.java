class Solution {
    public boolean canJump(int[] nums) {
        boolean[] possible = new boolean[nums.length];
        possible[possible.length - 1] = true;
        int steps = 0, curr = 0;
        for(int i = nums.length - 2; i >= 0; i--){
            steps = nums[i];
            curr = 1;
            while(curr <= steps){
                if(possible[i + curr]){
                    possible[i] = true;
                    break;
                } else {
                    curr++;
                }
            }
        }
        return possible[0];
    }
}

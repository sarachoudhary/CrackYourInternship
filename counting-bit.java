class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0;i<ans.length;i++){
            ans[i] = count(i);
        }
        return ans;
    }
    public static int count(int i){
        int count = 0;
        if((i & 1) == 1){
            count++;
        }
        while(i != 0){
            i = i>>1;
            if((i & 1)==1){
                count++;
            }
        }
        return count;
    }
}

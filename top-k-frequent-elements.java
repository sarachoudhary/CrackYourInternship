class Solution {
    class Pair implements Comparable<Pair>{
        int val;
        int count;
        public Pair(int val, int count){
            this.val = val;
            this.count = count;
        }
        @Override
        public int compareTo(Pair p2){
            return this.count - p2.count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int count = 1;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            } else {
                pq.add(new Pair(nums[i - 1], count));
                count = 1;
            }
        }
        pq.add(new Pair(nums[nums.length - 1], count));

        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = pq.remove().val;
        }
        return ans;
    }
}

class Solution {
    
    public boolean pairexists(int s, int e, int arr[], int x){
        if(s == e){
            return false;
        }
        if(arr[e] - arr[s] == x){
            return true;
        } else if(arr[e] - arr[s] > x){
            return pairexists(s, e - 1, arr, x) || pairexists(s + 1, e, arr, x);
        }
        return false;
    }
    
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        if(pairexists(start, end, arr, x)){
            return 1;
        }
        return -1;
    }
}

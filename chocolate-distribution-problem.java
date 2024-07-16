class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int min =   Integer.MAX_VALUE;
        int s = 0;
        int e = m-1;
        while(e < a.size()){
            min = Math.min(min, a.get(e)-a.get(s));
            s++;
            e++;
        }
        return min;
    }
}

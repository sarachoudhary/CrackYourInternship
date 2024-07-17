class Solution {
    public boolean ispart(String haystack, String needle, int idx){
        int n = 0;
        for(int i=idx;i<idx + needle.length();i++){
            if(haystack.charAt(i) != needle.charAt(n)){
                return false;
            }
            n++;
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(ispart(haystack,needle,i)){
                    return i;
                }
            }
        }
        return -1;
    }
}

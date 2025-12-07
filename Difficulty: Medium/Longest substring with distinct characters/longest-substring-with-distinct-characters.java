class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int l=0,r=0,maxlen=0;
        int hashlen=256;
        int[] hash=new int[hashlen];
        int n=s.length();
        Arrays.fill(hash,-1);
        while(r<n){
            if(hash[s.charAt(r)]>=l){
                l=Math.max(hash[s.charAt(r)]+1,l);
            }
            int len=r-l+1;
            maxlen=Math.max(len,maxlen);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxlen;
    }
}
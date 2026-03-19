// User function Template for Java
class Solution {
    public int countWays(String digits) {
        // code here
        int n=digits.length();
        if(digits==null||digits.length()==0){
            return 0;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=digits.charAt(0)!='0'?1:0;
        for(int i=2;i<=n;i++){
            int first=Integer.valueOf(digits.substring(i-1,i));
            int sec=Integer.valueOf(digits.substring(i-2,i));
            if(first>=1 && first<=9){
                dp[i]+=dp[i-1];
            }
            if(sec>=10 && sec<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
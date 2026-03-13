class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int maxprofit=Integer.MIN_VALUE;
            for(int j=1;j<=i;j++){
                maxprofit=Math.max(maxprofit,price[j-1]+dp[i-j]);
                
            }
            dp[i]=maxprofit;
        }
        return dp[n];
        
    }
}
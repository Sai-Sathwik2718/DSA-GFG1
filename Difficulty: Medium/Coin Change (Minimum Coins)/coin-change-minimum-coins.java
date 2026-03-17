class Solution {

    public int minCoins(int coins[], int sum) {
        // code here
        int n=coins.length;
        int INF=(int)1e9;
        int[][] dp=new int[n+1][sum+1];
        for(int j=1;j<=sum;j++){
            dp[0][j]=INF;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                dp[i][j]=dp[i-1][j];
                if(coins[i-1]<=j && dp[i][j-coins[i-1]]!=INF){
                    dp[i][j]=Math.min(dp[i][j],1+dp[i][j-coins[i-1]]);
                }
            }
        }
        return dp[n][sum]==INF?-1:dp[n][sum];
    }
}
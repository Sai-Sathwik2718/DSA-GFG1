class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int totsum=0;
        for(int num:arr){
            totsum+=num;
        }
        if((totsum+diff)%2!=0 || diff>totsum) return 0;
        int k=(totsum+diff)/2;
        int[] dp=new int[k+1];
        dp[0]=1;
        if(arr[0]<=k) dp[arr[0]]+=1;
        for(int i=1;i<arr.length;i++){
            int[] curr=new int[k+1];
            curr[0]=1;
            for(int t=0;t<=k;t++){
                int nottake=dp[t];
                int take=0;
                if(arr[i]<=t){
                    take=dp[t-arr[i]];
                }
                curr[t]=take+nottake;
            }
            dp=curr;
        }
        return dp[k];
    }
}

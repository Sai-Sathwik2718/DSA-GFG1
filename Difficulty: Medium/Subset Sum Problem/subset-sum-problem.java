class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        boolean[][] dp=new boolean[n][sum+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=sum){
            dp[0][arr[0]]=true;
        }
        for(int ind=1;ind<n;ind++){
            for(int target=1;target<=sum;target++ ){
                boolean nottake=dp[ind-1][target];
                boolean take=false;
                if(arr[ind]<=target){
                    take=dp[ind-1][target-arr[ind]];
                }
                dp[ind][target]=nottake||take;
            }
        }
        return dp[n-1][sum];
    }
}
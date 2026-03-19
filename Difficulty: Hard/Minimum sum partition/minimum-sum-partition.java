// User function Template for Java

class Solution {

    public int minDifference(int arr[]) {
        // Your code goes here
        int totsum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            totsum+=arr[i];
        }
        boolean[][] dp=new boolean[n][totsum+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(arr[0]<totsum){
            dp[0][arr[0]]=true;
        }
        for(int ind=1;ind<n;ind++){
            for(int target=1;target<=totsum;target++){
                boolean nottake=dp[ind-1][target];
                boolean take=false;
                if(arr[ind]<=target){
                    take=dp[ind-1][target-arr[ind]];
                }
                dp[ind][target]=nottake||take;
            }
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<=totsum;i++){
            if(dp[n-1][i]){
                int diff=Math.abs(i-(totsum-i));
                mini=Math.min(mini,diff);
            }
        }
        return mini;
    }
}

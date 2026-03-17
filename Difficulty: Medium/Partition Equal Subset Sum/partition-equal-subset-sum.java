class Solution {
    static boolean equalPartition(int arr[]) {
        int n = arr.length;

        int totsum = 0;
        for(int i = 0; i < n; i++){
            totsum += arr[i];
        }


        if(totsum % 2 != 0) return false;

        int target = totsum / 2;

        boolean[][] dp = new boolean[n][target + 1];

        for(int i = 0; i < n; i++){
            dp[i][0] = true;
        }

        if(arr[0] <= target){
            dp[0][arr[0]] = true;
        }

        for(int ind = 1; ind < n; ind++){
            for(int t = 1; t <= target; t++){
                boolean nottake = dp[ind-1][t];
                boolean take = false;

                if(arr[ind] <= t){
                    take = dp[ind-1][t - arr[ind]];
                }

                dp[ind][t] = nottake || take;
            }
        }

        return dp[n-1][target]; 
    }
}
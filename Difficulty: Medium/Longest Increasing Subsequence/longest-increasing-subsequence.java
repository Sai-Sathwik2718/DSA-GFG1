class Solution {
    static int lis(int arr[]) {
        // code here
       int n=arr.length;
       int[] dp=new int[n];
       Arrays.fill(dp,1);
       for(int i=1;i<n;i++){
           for(int j=0;j<i;j++){
               if(arr[i]>arr[j]){
                   dp[i]=Math.max(dp[i],dp[j]+1);
               }
           }
       }
       int ans=0;
       for(int x:dp){
           ans=Math.max(ans,x);
       }
       return ans;
    }
}
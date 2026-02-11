class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int sum1=0;
        for(int i=0;i<k;i++){
            sum1+=arr[i];
        }
        int maxsum=sum1;
        for(int i=k;i<n;i++){
            sum1+=arr[i]-arr[i-k];
            maxsum=Math.max(sum1,maxsum);
        }
        return maxsum;
    }
}
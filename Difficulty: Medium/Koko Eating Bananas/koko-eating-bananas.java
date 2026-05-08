class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low=1;
        int high=0;
        for(int j:arr){
            high=Math.max(high,j);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long tothrs=0;
            for(int b:arr){
                tothrs+=(b+mid-1)/mid;
            }
            if(tothrs<=k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}

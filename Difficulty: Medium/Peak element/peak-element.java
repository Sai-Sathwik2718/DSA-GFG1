class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        int low=0,high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    
}
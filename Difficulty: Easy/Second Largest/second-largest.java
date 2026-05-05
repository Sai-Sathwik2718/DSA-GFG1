class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int slarge=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>slarge && arr[i]!=largest){
                slarge=arr[i];
            }
        }
        return slarge;
    }
}
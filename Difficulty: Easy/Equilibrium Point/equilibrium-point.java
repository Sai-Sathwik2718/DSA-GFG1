class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int tot=0;
        for(int num:arr){
            tot+=num;
        }
        int left=0;
        for(int i=0;i<n;i++){
            int right=tot-left-arr[i];
            if(left==right) return i;
            left+=arr[i];
        }
        return -1;
    }
}

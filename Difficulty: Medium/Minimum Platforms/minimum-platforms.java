class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n=arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platforms=1;
        int maxplatforms=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platforms++;
                i++;
            }else{
                platforms--;
                j++;
            }
            maxplatforms=Math.max(platforms,maxplatforms);
        }
        return maxplatforms;
        
    }
}

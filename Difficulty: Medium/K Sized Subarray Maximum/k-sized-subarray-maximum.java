class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        int maxi=arr[0];
        for(int i=0;i<k;i++){
            maxi=Math.max(maxi,arr[i]);
            
        }
        res.add(maxi);
        
            
        for(int i=k;i<n;i++){
            int outgoing=arr[i-k];
            if(outgoing==maxi){
                maxi=arr[i-k+1];
                for(int j=i-k+1;j<=i;j++){
                    maxi=Math.max(maxi,arr[j]);
                }
            }else{
                maxi=Math.max(maxi,arr[i]);
            }
            res.add(maxi);
        }
        return res;
        
    }
}
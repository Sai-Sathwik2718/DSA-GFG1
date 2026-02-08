class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        int[] pref=new int[n+1];
        pref[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        for(int i=0;i<pref.length-1;i++){
            res.add(pref[i]);
        }
        return res;
    }
}
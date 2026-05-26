class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        findcomb(0,arr,target,ans,new ArrayList<>());
        return ans;
    }
    public void findcomb(int ind,int[] arr,int target,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findcomb(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findcomb(ind+1,arr,target,ans,ds);
    }
}
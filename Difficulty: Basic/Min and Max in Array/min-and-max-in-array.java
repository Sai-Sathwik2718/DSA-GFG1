class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> ar=new ArrayList<>();
        int mini=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        ar.add(mini);
        ar.add(max);
        return ar;
    }
}

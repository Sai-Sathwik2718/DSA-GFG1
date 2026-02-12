class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map.getOrDefault(target,0);
    }
}

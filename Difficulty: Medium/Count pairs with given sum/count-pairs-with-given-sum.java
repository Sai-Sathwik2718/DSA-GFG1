class Solution {
    int countPairs(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int cnt=0;
        for(int num:arr){
            int x=target-num;
            if(map.containsKey(x)){
                cnt+=map.get(x);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return cnt;
    }
}
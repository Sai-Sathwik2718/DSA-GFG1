class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pr=new PriorityQueue<>();
        for(int a:arr){
            pr.add(a);
        }
        for(int i=1;i<k;i++){
            pr.poll();
        }
        return pr.poll();
    }
}

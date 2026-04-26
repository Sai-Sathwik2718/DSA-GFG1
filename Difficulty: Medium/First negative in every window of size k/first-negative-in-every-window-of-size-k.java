class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> result=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]<0){
                q.add(j);
            }
             if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {
                if (q.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(arr[q.peek()]);
                }
                if (!q.isEmpty() && q.peek() == i) {
                    q.poll();
                }
                i++;
                j++;
            }
        }
        return result;
        
    }
}

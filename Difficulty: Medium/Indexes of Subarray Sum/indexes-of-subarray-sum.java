

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        // prefixSum -> index
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);   // base case

        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum - target)) {
                int start = map.get(prefixSum - target) + 1;
                int end = i;

                // GFG uses 1-based indexing
                res.add(start + 1);
                res.add(end + 1);
                return res;
            }

            // store first occurrence only
            map.putIfAbsent(prefixSum, i);
        }

        res.add(-1);
        return res;
    }
}

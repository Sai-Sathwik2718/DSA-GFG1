class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if (k > arr.length) return -1;
        
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int ans = -1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (isPossible(arr, k, mid)) {
                ans = mid;
                high = mid - 1; // minimize
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
    public static boolean isPossible(int[] arr, int k, int maxPages) {
        int students = 1;
        int pages = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPages) return false;
            
            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {
                students++;
                pages = arr[i];
            }
        }
        
        return students <= k;
    }
}
class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length;
        int m=b.length;
        int[] arr = new int[n + m];

        // copy a
        for(int i = 0; i < n; i++) {
            arr[i] = a[i];
        }

        // copy b
        for(int i = 0; i < m; i++) {
            arr[n + i] = b[i];
        }
        Arrays.sort(arr);
        return arr[k-1];

    }
}
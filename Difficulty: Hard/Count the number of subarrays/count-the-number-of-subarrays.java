// User function Template for Java
class Solution {
    long countSubarray(int N, int A[], long L, long R) {
        // code here
        return countatmost(A,R)-countatmost(A,L-1);
    }
    long countatmost(int A[],long x){
        long cnt=0;
        int left=0;
        long sum=0;
        for(int right=0;right<A.length;right++){
            sum+=A[right];
            while(sum>x){
                sum-=A[left];
                left++;
            }
            cnt+=(right-left+1);
        }
        return cnt;
    }
}
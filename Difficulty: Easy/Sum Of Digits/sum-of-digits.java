class Solution {
    static int sumOfDigits(int n) {
        // code here
        int ans=0;
        while(n!=0){
            int rem=n%10;
            ans+=rem;
            n=n/10;
        }
        return ans;
    }
}

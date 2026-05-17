// User function Template for Java

class Solution {

    static int isHappy(int N) {
        // code here
        int fast=N;
        int slow=N;
        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));
            
        }while(fast!=slow);
        if(slow==1) return 1;
        return 0;
    }
    static int findsquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}
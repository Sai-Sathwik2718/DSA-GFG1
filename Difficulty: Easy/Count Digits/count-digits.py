#User function Template for python3

class Solution:
    def evenlyDivides(self, n):
        # code here
        cnt=0
        org=n
        while n!=0:
            a=n%10
            if a!=0 and org%a==0:
                cnt+=1
            n=n//10
        return cnt
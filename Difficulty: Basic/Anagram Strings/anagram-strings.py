#User function Template for python3
class Solution:
    def areAnagram(ob, S1, S2):
        # code here 
        if sorted(S1)==sorted(S2):
            return 1
        else:
            return 0

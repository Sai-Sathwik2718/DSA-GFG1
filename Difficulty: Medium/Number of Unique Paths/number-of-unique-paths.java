// User function Template for Java

class Solution {
    // Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) {
        // Your code here
        int[][] dp=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==0 && j==0) dp[0][0]=1;
                else{
                    int up=0,down=0;
                    if(i>0){
                        up=dp[i-1][j];
                    }if(j>0){
                        down=dp[i][j-1];
                    }
                    dp[i][j]=up+down;
                }
            }
        }
        return dp[a-1][b-1];
    }
}
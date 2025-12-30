class Solution {
    public int climbStairs(int n) {
        int dp[ ]= new int[n];
        if(n<=2)return dp.length;
        dp[0]=1;dp[1]=2;int i=2;
        for(;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[i-1];
    }
}
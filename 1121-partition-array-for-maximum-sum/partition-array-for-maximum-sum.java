class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[]= new int[arr.length+1];
        for(int i=1;i<=arr.length;++i){
            int currMax=0,best=0;
            for(int j=1;j <= k && i-j >=0;++j){
                currMax =Math.max(currMax,arr[i-j]);
                best=Math.max(dp[i-j]+currMax * j,best);
            }
            dp[i]=best;
        }
    return dp[arr.length];
    }
}
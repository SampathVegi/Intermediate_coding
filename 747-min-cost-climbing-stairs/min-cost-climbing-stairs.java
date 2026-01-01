// class Solution {
//     public int minCostClimbingStairs(int[] cost) {
//         int dp[]=new int[cost.length+1];
//         int i=2 ;        
//         for(;i<dp.length;i++){
//             dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
//         }
//         return dp[i-1];
//     }
// }
class Solution{
    public int minCostClimbingStairs(int[] cost){
        int first=0,second=0;

        //if(cost.length<=2) return Math.min(first,second);
        for(int i=2;i<=cost.length;i++){
            int temp = Math.min(first+cost[i-2],second+cost[i-1]);
            first=second;
            second=temp;
        }
        return second;
    }
}
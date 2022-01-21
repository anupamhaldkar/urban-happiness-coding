public class Solution {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] costs) {
        // write your code here
        int dp[] = new int[3];
        int dp1,dp2,dp3;
        for(int i=0;i<costs.length;i++){
            dp1 = costs[i][0] + Math.min(dp[1],dp[2]);
            dp2 = costs[i][1] + Math.min(dp[0],dp[2]);
            dp3 = costs[i][2] + Math.min(dp[0],dp[1]);
            dp[0]=dp1;
            dp[1]=dp2;
            dp[2]=dp3;
        }
       

        return Math.min(dp[0],Math.min(dp[1],dp[2]));
    }
}

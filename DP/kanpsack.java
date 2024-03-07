package DP;

public class kanpsack {
    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int mWt = 7;
        int dp[][] = new int[val.length + 1][mWt + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(maxProfit(val, wt, mWt, val.length, dp));
    }

    private static int maxProfit(int[] val, int[] wt, int mWt, int n, int[][] dp) {
        if (mWt == 0 || n == 0) {
            return 0;
        }
        if (dp[n][mWt] != -1) {
            return dp[n][mWt];
        }
        if (wt[n - 1] <= mWt) {
            // include

            int ans1 = val[n - 1] + maxProfit(val, wt, mWt - wt[n - 1], n - 1, dp);

            // exclude
            int ans2 = maxProfit(val, wt, mWt, n - 1, dp);

            dp[n][mWt] = Math.max(ans1, ans2);
            return dp[n][mWt];

        } else {
            dp[n][mWt] = maxProfit(val, wt, mWt, n - 1, dp);
            return dp[n][mWt];
        }
    }
}

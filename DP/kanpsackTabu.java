package DP;

public class kanpsackTabu {
    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int mWt = 7;
        int dp[][] = new int[val.length + 1][mWt + 1];

        System.out.println(tabu(val, wt, mWt));
    }

    private static int tabu(int[] val, int[] wt, int mWt) {

        int dp[][] = new int[val.length + 1][mWt + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < val.length + 1; i++) {
            for (int j = 1; j < mWt + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];

                if (w <= j) // valid wali condition
                {
                    // include
                    int ans1 = v + dp[i - 1][j - wt[i - 1]];

                    // exclude
                    int ans2 = dp[i - 1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }

                else // exclude
                {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return dp[val.length][mWt];
    }
}

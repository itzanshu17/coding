package DP;

public class rodCutting {
    public static void main(String[] args) {
        int len[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int tRod = 8;
        System.out.println(maxProfit(len, price, tRod));
    }

    private static int maxProfit(int[] len, int[] price, int tRod) {
        int n = price.length;
        int dp[][] = new int[n + 1][tRod + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < tRod + 1; j++) {
                // valid
                if (len[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - len[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][tRod];
    }
}

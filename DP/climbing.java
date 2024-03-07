package DP;

public class climbing {
    public static void main(String[] args) {
        int n = 5;
        int[] f = new int[n + 1];
        System.out.println(climbing(n, f));
        System.out.println(climb2(n));
    }

    private static int climb2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    private static int climbing(int n, int[] f) {
        if (n <= 0) {
            return n + 1;
        }
        if (f[n] == 0) {
            f[n] = climbing(n - 2, f) + climbing(n - 1, f);
        }
        return f[n];
    }
}

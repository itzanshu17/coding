package DP;

public class fibonacci {
    public static void main(String[] args) {
        int n = 500;
        int f[] = new int[n + 1];
        System.out.println(fibo(n, f));

    }

    private static int fibo(int n, int[] f) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] == 0) {
            f[n] = fibo(n - 1, f) + fibo(n - 2, f);
        }
        return f[n];
    }
}

package recursion;

public class tiling {
    public static int tilingpob(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int verticaltiles = tilingpob(n - 1);
        int horizontiles = tilingpob(n - 2);
        int totalways = verticaltiles + horizontiles;
        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(tilingpob(4));
    }
}

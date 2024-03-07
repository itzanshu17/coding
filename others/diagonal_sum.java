public class diagonal_sum {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, }, { 5, 6, 7, 8, }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        diagonalsum(matrix);
    }

    private static void diagonalsum(int[][] matrix) {
        int sum = 0;

        // for(int i=0;i<matrix.length;i++) {
        // for(int j=0;j<matrix.length;j++) {
        // if(i==j) {
        // sum = sum + matrix[i][j];
        // }
        // if(i+j==matrix.length-1) {
        // sum = sum + matrix[i][j];
        // }
        // }
        // }
        // System.out.println(sum);

        int n = matrix.length - 1;
        for (int i = 0; i <= n; i++) {
            sum = sum + matrix[i][i];
            if (i != n - i) {
                sum = sum + matrix[i][n - i];
            }
        }
        System.out.println(sum);
    }
}

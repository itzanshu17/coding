package backtracking;

public class nqueen {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
        queenpos(0, board);
        System.out.println("Total ways are : " + count);
    }

    static int count = 0;

    private static void queenpos(int n, char[][] board) {
        if (n == board.length) {
            count++;
            printboard(board);
            System.out.println();
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, n, j) == true) {
                board[n][j] = 'Q';
                queenpos(n + 1, board);
                board[n][j] = '-';
            }

        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // vertically up
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right up
        for (int i = row - 1, j = col + 1; j < board.length && i >= 0; j++, i--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static void printboard(char[][] board) {
        System.out.println("--------- Chess Board----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}

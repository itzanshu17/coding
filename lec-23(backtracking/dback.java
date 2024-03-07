//N QUEENS....
public class dback {
    public static boolean issafe(char board[][], int row, int col){
        //vertical up
        for(int i=row; i>=0;i--){
            if(board[i][col]=='q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1, j=col-1; i>=0&&j>=0;i--,j--){
            if(board[i][j]=='q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1, j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='q'){
                return false;
            }
        }
        return true;


    }
    public static void nqueen(char board[][], int row){
        if(row==board.length){
            printboard(board);
            count++;
            return;

        }
        for(int j=0; j<board.length;j++){
            if(issafe(board, row, j)){
            board[row][j]='q';
            nqueen(board, row+1);
            board[row][j]='.';
            }
        }
    }
    public static void printboard(char board[][]){
        System.out.println("------------CHESSBOARD-------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    static int count=0;
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0);
        System.out.println(count);

    }
    
}

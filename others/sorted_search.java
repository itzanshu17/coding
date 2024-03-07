public class sorted_search {
    public static void main(String[] args) {
        int key = 12;
        int matrix[][] = { { 1, 2, 3, 4, }, { 5, 6, 7, 8, }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        search(matrix, key );

    }

    private static void search(int[][] matrix, int key) {
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int a= 0 ;
        while(a<=n && m >=0 ) {
            if(key < matrix[a][m]) {
                m--;
            }
            else if( key > matrix[a][m]) {
                a++;
            }
            else {
                System.out.println(a+" "+m);
                return;
            }
        }  
        System.out.println("not found");
    }
}

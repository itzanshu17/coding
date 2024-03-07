public class gtwo {
    public static void transverse(int matrix[][]){
        for(int i=0; i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        
    }

    public static void main(String args[]){
        int matrix[][]={{12,13,14},
                        {15,16,17},
                        {23,12,44}};
        transverse(matrix);
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}

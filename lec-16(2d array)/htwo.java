import java.util.*;
public class htwo {
    public static void sort(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
        Arrays.sort(matrix[i]);
        }
    }
    public static void transverse(int matrix[][]){
        for(int i=0; i<matrix.length-1; i++){
            for(int j=i+1; j<matrix.length; j++){
                
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
            }
        }
    }
    public static void sorting(int matrix[][]){
        sort(matrix);
        transverse(matrix);
        sort(matrix);
        transverse(matrix);
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][]={{5,4,3,1},
                         {7,6,5,4},
                         {8,9,2,5}};
        
    
    sorting(matrix);
}
    
}

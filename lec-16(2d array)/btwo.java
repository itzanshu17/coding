import java.util.*;
public class btwo {
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.print("key fount at index "+i+","+ j);
                    return true;
                }

            }
        }
        return false;
    }
    public static void main(String args[]){
        
        int key=3;
        Scanner sc= new Scanner(System.in);
        int matrix[][]=new int[3][3];
        for(int i=0; i<3;i++){
            for(int j=0;j<3; j++){
                matrix[i][j]=sc.nextInt();
                 


            }
        }
        for(int i=0; i<3;i++){
            for(int j=0;j<3; j++){
                System.out.print(matrix[i][j]);
                 


            }
            System.out.println();
        }
        search(matrix, key);


    }
    
}

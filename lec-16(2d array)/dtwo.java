public class dtwo {
    public static int diagsum(int matrix[][]){
    int sum=0;
    
    // //primary diagnol sum
    // for(int i=0; i<matrix.length; i++){
    //     for(int j=0; j<matrix[0].length; j++){
    //         if(i==j){
    //             sum=sum+matrix[i][j];
    //         }
    //         else if(i+j==matrix.length-1){
    //             sum+=matrix[i][j];
    //         }
    //     }
    // }
    for(int i=0; i<matrix.length;i++){
        //p.d
        sum+=matrix[i][i];
        //s.d
        if(i!=matrix.length-1-i){
        sum+=matrix[i][matrix.length-i-1];
        }

    }
    
    return sum;
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11}};
                        //{13,14,15,16}};
                        System.out.print( diagsum(matrix));
    }
    
}

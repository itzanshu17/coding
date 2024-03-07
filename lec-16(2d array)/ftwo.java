public class ftwo {
    public static void search(int matrix[][]){

        int key=8;
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count=count+1;    
                }   
            }  
        }
        System.out.println(count);
    }
    public static void sum(int matrix[][]){
        int n=1; 
        int m;
        int sum=0;
        for(int j=0; j<matrix[0].length;j++){
            sum=sum+matrix[n][j];
        }
        System.out.println(sum);

    }   
    public static void main(String arg[]){
        int matrix[][]={{4,7,8},
                        {8,8,7},
                        {9,10,11}};
    
    //search(matrix);
    sum(matrix);

    }
    
}

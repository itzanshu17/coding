import java.util.*;

public class atwo {
    public static void main(String args[]){
        int abc[][]=new int [3][4];
        int n=3;
        int m=4;
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                abc[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(abc[i][j]);
            }
            System.out.println();
        }
        
    }
    
}

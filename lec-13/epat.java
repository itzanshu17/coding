public class epat {
    public static void main(String args[]){
        int n=5, m=9;
        for(int i=1; i<=n;i++){
            //print spaces first
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //print starts 
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
           
            
            System.out.println();
        }
    }
    
}

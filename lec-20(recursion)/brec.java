public class brec {
    public static void fact(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
            
        }
        System.out.print(factorial);
    }
    public static void main(String args[]){
        int n=6;
        fact(n);

    }
}

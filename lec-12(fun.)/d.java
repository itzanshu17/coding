public class d {
    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        
        }
        return fact;
    }
    public static int bino(int a, int b){
       int fac_a=factorial(a);
       int fac_b=factorial(b);
       int fac_amb=factorial(a-b);
       int binocoff= fac_a/(fac_b*fac_amb);
       return binocoff;


    }
    public static void main(String args[]){
        System.out.print(bino(5,2));


    }
    
}

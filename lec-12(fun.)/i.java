//print all the prime number in range
public class i {
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
            
            }
            return true;
        }
        public static void printrange(int n){
            for(int i=2; i<=n; i++){
                if(isprime(i)){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        public static void main(String args[]){
            printrange(23);
        }
    }
    


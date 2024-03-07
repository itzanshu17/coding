//power
public class irec {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xpnm1=power(x,n-1);
        int xpn=x*xpnm1;
        return xpn;
    }
    public static void main(String args[]){
       System.out.println( power(2,3));
    }
    
}

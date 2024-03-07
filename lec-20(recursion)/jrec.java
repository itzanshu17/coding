public class jrec {
    public static int pwr(int x, int n){
        if(n==0){
            return 1;
        }
        int p=pwr(x,n/2)*pwr(x,n/2);
        // n is odd
        if(n%2!=0){
            p=x*p;
        }
        return p;
    }
    public static void main(String args[]){
        System.out.println(pwr(4,3));
}
}

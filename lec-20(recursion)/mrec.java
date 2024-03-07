public class mrec {
    public static int friend(int n){
        //base case
        if(n==1||n==2){
            return n;        }
        //single
        int f1=friend(n-1);
        //pair
        int f2=friend(n-2);
        int pair=(n-1)*f2;
        int total=f1+pair;
        return total;
    }
    public static void main(String args[]){
        System.out.println(friend(3));
    }
}

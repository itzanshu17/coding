public class drec {
    public static void printSum(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
        int n=5;
        printSum(n);
    }
}

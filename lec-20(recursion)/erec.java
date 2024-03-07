public class erec {
    public static int fabo(int n){
        if(n==0||n==1){
            return n;
        }
        int f1=fabo(n-1);
        int f2=fabo(n-2);
        int ff=f1+f2;
        return ff;
    }
    public static void main(String args[]){
        int n=4;
        System.out.print(fabo(n));
    }

    
}

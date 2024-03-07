public class krec {
    public static int blah(int n){
        if(n==0||n==1){
            return 1;
        }
        int v=blah(n-1);
        int h=blah(n-2);
        int f=v+h;
        return f;

    }
    public static void main(String args[]){
        System.out.println(blah(3));
    }
    
}

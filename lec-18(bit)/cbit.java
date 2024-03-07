//odd nd even
public class cbit {
    public static void check(int n){
        int bit=1;
        if((n & bit )== 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

    }
    public static void main(String args[]){
        check(5);

    }
    
}

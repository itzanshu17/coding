public class l {
    public static void calcaver(int a, int b, int c){
        int average=(a+b+c)/3;
        System.out.println(average);
    }
    public static void isEven(int n){
        if(n%2==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
    public static void palindrome(int n){
        int temp =n;
        int r;
        int p=0;
        while(n>0){
            r=n%10;
            p=(p*10)+r;
            n=n/10;
            
        }
        if(temp==p){
            System.out.println("given number is palindrom. ");
        }
        else{
            System.out.println("given number is not palindrome.");
        }
        

    }
    public static void calcsum(int n){
        int sum=0;
        
        while(n>0){
        int l=n%10;
        sum=sum+l;
        n=n/10;
        }
        
        System.out.println(sum);
    }
    public static boolean isOdd(int n){
        if(n%2==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String args[]){
        calcaver(2,3,12);
        isEven(12);
        palindrome(121);
        calcsum(123);
        isOdd(81);
        if(isOdd(82)){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

    }
    
}

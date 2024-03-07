import java.util.*;
public class afun {
    public static void calcsum(int a, int b)//a and b are formal parametres/parameter comes while difining the function
    {
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calcsum(a,b);//a nad b are arguments as they are being used during function calling.
    }
    
}

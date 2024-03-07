import java.util.*;

public class nd {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter yoor income in L.pa");
        int a=sc.nextInt();
        double tax;
        if(a<5.0){
            System.out.println("no tax");
        }
        else if( a>=5.0 && a<10.0){
             tax= a*(0.2);
            System.out.println("tax will be:"+ tax);

        }
        else{
            tax=a*0.3;
            System.out.println("tax will be: " +tax);
        }

    }
    
}

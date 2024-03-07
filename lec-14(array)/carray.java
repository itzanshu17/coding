
import java.util.*;
public class carray {
    public static int large(int array[]){
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0; i<array.length; i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }
        return largest;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5];
        System.out.print("enetr your elements:");
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();

        }
        System.out.println("the largest element is "+ large(array));
    }
    
}


// linear search..
import java.util.*;
public class barray {
    public static int linearsearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
            return i;
        }
    }
            return -1;        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int numbers[]= new int[5];
        System.out.print("enter your array: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("enter your key value: ");   
        int key= sc.nextInt();
        int index= linearsearch(numbers, key);
        if(index==-1){
            System.out.println("element  not found.");
        }
        else{
            System.out.println("element is at "+ index +" index.");
        }
    }   
}

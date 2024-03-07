import java.util.*;
public class appa {
    public static void push(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[count];
            arr[count]=temp;
            count++;
            }
            
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,0,4,0,5,0,6};
        push(arr);
        System.out.println(Arrays.toString(arr));
    }
}
    


//binary search.. prerequisite- sorted array...
import java.util.*;
public class darray {
    public static int search(int array[], int key){
        int start=0; int end=array.length-1;
        while(start<=end){
            int mid=(start + end)/2;
            if(array[mid]==key){
                return mid;
            }
            if(array[mid]< key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1 ;

    }
    public static void main(String args[]){
        int array[]={2,4,6,8,10,12,14};
        int key =2;
        System.out.println("index for key is at "+ search(array, key));
    }
    
}

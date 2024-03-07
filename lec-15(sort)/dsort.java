import java.util.*;
public class dsort {
    public static void main(String args[]){
        Integer abc[]={3,4,6,2,1,5};
        //inbuilt array
        //Arrays.sort(abc);
        Arrays.sort(abc, Collections.reverseOrder());
        for(int i=0; i<=abc.length-1; i++){
            System.out.print(abc[i]+" ");
        }

    }
    
}

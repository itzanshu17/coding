//SWAP 2 NO. 
import java.util.ArrayList;
public class earrli {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp=list.get(1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String ags[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int idx1=1, idx2=3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);


    }
    
}

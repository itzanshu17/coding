//SORT THE LIST
import java.util.ArrayList;

public class farrli {
    public static void sort(ArrayList<Integer> list){
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                int temp=list.get(i);
                list.set(i, list.get(i+1));
                list.set(i+1, temp);
            }
            
        }
    }
    public static void main(String args[]){
         ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(41);
        list.add(15);
        list.add(21);
        sort(list);
        System.out.println(list);
    }
    
}

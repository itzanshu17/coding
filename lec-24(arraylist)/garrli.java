// multidimension arraylist print....
import java.util.ArrayList;
public class garrli {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1); list1.add(2); list1.add(3);
        mainlist.add(list1);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(4); list2.add(5); list2.add(6);
        mainlist.add(list2);
        //print mainlist
        System.out.println(mainlist);
        //print the list one by ine using for loop
        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> curr=mainlist.get(i);
            for(int j=0; j<curr.size(); j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }


    }
    
}

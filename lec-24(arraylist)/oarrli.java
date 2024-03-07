import java.util.ArrayList;
public class oarrli {
    public static ArrayList<Integer> check(ArrayList <Integer> list){
    ArrayList <Integer> ret=new ArrayList<>();
    for(int i=0; i<list.size()-1; i++){
        if(list.get(i)-list.get(i+1)!=1 && list.get(i)-list.get(i+1)!=-1){
            ret.add(list.get(i));
        }
    }
    return ret;

    }
    public static void main(String args[]){
    ArrayList <Integer> list=new ArrayList<>();
    list.add(10);
    list.add(5);
    list.add(6);
    list.add(8);
    System.out.println(check(list));

    }
    
}

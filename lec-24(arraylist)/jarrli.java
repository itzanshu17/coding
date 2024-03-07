//contain most water..
//2 pointer approach..O(n)..
import java.util.ArrayList;
public class jarrli {
    public static int storewater(ArrayList<Integer> height){
        //2 pointer approach
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp<rp){
            //calculate area..
            int ht=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater, currwater);
            //update ptr..
            if(height.get(lp)< height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storewater(height));
    }
    
}

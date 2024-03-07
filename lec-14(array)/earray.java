//reverse the array
public class earray {
    public static void reverse(int array[]){
        int first=0; int last=array.length-1;
        while(first<=last){
            //swap
            int temp=array[last];
            array[last]=array[first];
            array[first]=temp;
            first++;
            last--;

        }
        

    }
    public  static void main(String args[]){
        int array[]={10,20,30,40,50};
        reverse(array);
        for(int i=0; i<array.length-1; i++){
            System.out.print( +array[i]+" ");
        }
        System.out.println();
    }
    
}

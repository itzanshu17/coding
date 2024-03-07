//selection sort.....
public class bsort {
    public static void sort(int abc[]){
        for(int i=0; i<=abc.length-1; i++){
            int minpost=i;
            for(int j=i+1; j<=abc.length-1; j++){
                if(abc[minpost]>abc[j]){
                    minpost=j;
                }
            }
            //swap
            int temp=abc[minpost];
            abc[minpost]=abc[i];
            abc[i]=temp;

        }

    }
    public static void print(int abc[]){
        for(int i=0; i<=abc.length-1; i++){
            System.out.print(abc[i]+" ");
        }
    }
    public static void main(String args[]){
        int abc[]={4,6,2,1,3};
        sort(abc);
        print(abc);
    }
    
}

//bubble sort.........
//package lec-15(sort);

public class asort {
    public static void sort(int abc[]){
        for(int i=0; i<abc.length-1; i++){
            for(int j=0; j<abc.length-1-i; j++){
                if(abc[j]>abc[j+1]){
                    //swap
                    int temp= abc[j];
                    abc[j]=abc[j+1];
                    abc[j+1]=temp;
                }

            }
        }
    }
    public static void print(int abc[]){
        for(int i=0; i<=abc.length-1; i++){
        System.out.print(abc[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int abc[]={2,5,1,4,3};
        sort(abc);
        print(abc);
    }
    
}

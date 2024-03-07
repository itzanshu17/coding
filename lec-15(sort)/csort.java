public class csort {
    public static void sort(int abc[]){
        for(int i=1; i<=abc.length-1; i++){
            int curr=abc[i];
            int prev=i-1;
            while(prev>=0&& abc[prev]>curr){
                abc[prev+1]=abc[prev];
                prev--;
            }
            abc[prev+1]=curr;
        }

    }
    public static void print(int abc[]){
        for(int i=0; i<=abc.length-1; i++){
            System.out.print(abc[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int abc[]={4,5,2,3,1};
        sort(abc);
        print(abc);
    }
    
}

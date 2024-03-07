public class iarray{
    public static void sum(int abc[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[abc.length];
        prefix[0]=abc[0];
        //calculate prefix
        for(int i=0; i<prefix.length; i++){
            //prefix[i]=abc[i-1]+abc[i];
            prefix[i]=abc[i-1]+abc[i];
        }
        for(int i=0; i<abc.length; i++){
            int start=i;
        
        for(int j=i; j<abc.length; j++){
            int end=j;
            currsum=start==0? prefix[end]:prefix[end]-prefix[start-1];
            if(maxsum<currsum){
                maxsum=currsum;
            }

        }
    }
    System.out.println("max sum"+ maxsum);
}
public static void main(String args[]){
    int abc[]={3,-4,5,-6,7};
    sum(abc);
}
}
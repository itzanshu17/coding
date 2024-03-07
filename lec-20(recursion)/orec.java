public class orec {
static String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void index(int arr[],int key,int i){

        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]==key){
        //         System.out.print(i);

        //     }
        // }
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        index(arr,key,i+1);
        
    }
    public static void  stri(int numb){
        if(numb==0){
            return;
        }
        int fdg =numb%10;
        stri(numb/10);
        System.out.print(str[fdg]+" ");

        
    }
    public static int count(String str){
        if(str.length()==0){
            return 0;
        }
        return count(str.substring(1))+1;
        

    }
    public static void poss(String str){
        int i=str.length();
        if(str.length()==0){
            return;
        }
        System.out.print(str.substring(i)+" ");
        poss(str);
        
        
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,2,2,2,2,2};
        int key=2;
        index(arr,key,0);
        stri(1990);
        System.out.println( count("anjkbash"));
        poss("abc" );
    }
}

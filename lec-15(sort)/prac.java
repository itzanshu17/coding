public class prac {
    public static void bub(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                
            }
        }
    }
    public static void sel(int arr[]){
        for(int i=0; i<arr.length;i++){
            int max=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
             //swap
             int temp=arr[i];
             arr[i]=arr[max];
             arr[max]=temp;
           
        }

    }
    public static void ins(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=curr;
        }
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        //bub(arr);
        //sel(arr);
        ins(arr);
        print(arr);

    }
    
}

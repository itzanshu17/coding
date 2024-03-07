public class bdiv {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void quicksort(int arr[], int si, int ei){
        if(si<ei){
            
        
        int pidx=partition(arr, si, ei);
        quicksort(arr,si,pidx-1);
        quicksort(arr,pidx+1,ei);
    }
        }
    public static int partition(int arr[], int si, int ei ){
    int pivot=arr[ei];
    int i=si-1;// to create more space..
    for(int j=0; j<arr.length;j++){
        //check
        if(arr[j]<pivot){
            //swap wrt i
            int temp=arr[j];
            temp=arr[i];
            arr[i]=temp;
        
        }
        

        }
        i++;
        int temp=pivot;
        temp=arr[i];
        arr[i]=temp;
        return i;


    }
    public static void main(String args[]){
        int arr[]={5,4,6,3,7,0};
        quicksort(arr,0,arr.length-1);
        print(arr);
    }


    }
    


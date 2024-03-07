public class frec {
    public static boolean sort(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sort(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,9,5};
        System.out.print(sort(arr,0));
    }
    
}

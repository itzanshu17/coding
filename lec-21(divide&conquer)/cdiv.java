public class cdiv {
    public static int search(int arr[], int si, int ei, int tar){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(tar==arr[mid]){
            return mid;
        }
        //tar is smaller than mid..
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar &&arr[mid]>=tar){
                return search(arr, si, mid, tar);
            }
            else{
                return search(arr, mid+1, ei,tar);
            }
        }
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr,mid+1, ei,tar);
            }
            else{
                return search(arr,si, mid-1, tar );
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2,3};
        int tar=1;
       System.out.print( search(arr, 0, arr.length-1, tar));
    }
    
}

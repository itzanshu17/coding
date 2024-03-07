public class grec {
    //first occurence...
    public static int find(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return find(arr,key,i+1);
    }
    //last occurence..
    public static int last(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int ff =last(arr,key,i+1);
        if(ff==-1&& arr[i]==key){
            return i;
        }
        return ff;
    }
    public static void main(String args[]){
        int arr[]={12,3,4,5,6,23};
        int key=5;
        System.out.print(last(arr,key,0));
    }
    
}

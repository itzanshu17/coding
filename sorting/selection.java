package sorting;


public class selection {
    public static void selectsort(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            int pos = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[pos]>arr[j]) {
                    pos= j;
                }
            }
            int temp =arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        // calling
        selectsort(arr);
    }
}

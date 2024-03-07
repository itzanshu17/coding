package sorting;

public class counting_sort {
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        counting(arr);

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    // to know what is the largest element present in an array 
    private static void counting(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            largest =Math.max(largest, arr[i]);
        }

        // to know what is the count of each element in array 
        int count[] = new int [largest+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }

        int j=0;
        // to move through the array 
        for(int i=0;i<count.length;i++) {
            // to move inside a value 
            while(count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }
}

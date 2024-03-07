package sorting;

public class quick {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int pIdx = partition(arr, s, e);
        quicksort(arr, s, pIdx - 1);
        quicksort(arr, pIdx + 1, e);
    }

    private static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1;

        for (int j = s; j < e; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}

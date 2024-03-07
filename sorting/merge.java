package sorting;

public class merge {
    public static void mergedivide(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int m = (s + e) / 2;
        mergedivide(arr, s, m);
        mergedivide(arr, m + 1, e);
        mergea(arr, s, m, e);
    }

    private static void mergea(int[] arr, int s, int m, int e) {
        int temp[] = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int k = 0;
        while (i <= m && j <= e)
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }

        while (i <= m) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= e) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for (k = 0, i = s; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergedivide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

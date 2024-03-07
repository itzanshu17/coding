package recursion;

public class last_occ {
    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstocc(arr, 5, 0));
    }

    public static int firstocc(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = firstocc(arr, key, i + 1);
        if (isfound != -1) {
            return isfound;
        }
        if (arr[i] == key) {
            return i;
        }
        return isfound;
    }
}

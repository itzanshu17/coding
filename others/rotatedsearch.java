public class rotatedsearch {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    private static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            System.out.println("not found");
            return -1;
        }
        int m = (s + e) / 2;
        if (arr[m] == target) {
            return m;
        }
        // m on first part
        if (arr[s] <= arr[m]) {
            if (arr[s] <= target && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }

        // m on second part
        else {
            if (target >= arr[m] && target <= arr[e]) {
                return search(arr, target, m + 1, e);
            } else {
                return search(arr, target, s, m - 1);
            }
        }
    }
}

package sorting;
import java.util.*;

public class bubble {

    public static void bubblesort(int arr[]) {
        int swap=0;
        int a=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++; 
                }
                a++;
                if(swap==0) {
                    break;
                }
            }
        }
        System.out.println(swap);
        System.out.println(a);
        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sie of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        //input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // calling
        bubblesort(arr);
        sc.close();
    }
}

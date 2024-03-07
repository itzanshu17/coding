package stackc;

import java.util.Stack;

public class maxAreaHistogram {
    public static void nextSmallerOnRight(int[] arr, int[] ansr) {
        Stack<Integer> stack = new Stack<>();
        // Iterate through the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements from the stack until we find a smaller element
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            // If the stack is empty, there is no smaller element on the right
            if (stack.isEmpty()) {
                ansr[i] = -1;
            }
            // Otherwise, the index of the next smaller element is at the top of the stack
            else {
                ansr[i] = stack.peek();
            }
            // Push the current element's index onto the stack
            stack.push(i);
        }
    }

    public static void nextSmallerOnLeft(int[] arr, int[] ansl) {
        Stack<Integer> stack = new Stack<>();
        // Iterate through the array from left to right
        for (int i = 0; i < arr.length; i++) {
            // Pop elements from the stack until we find a smaller element
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            // If the stack is empty, there is no smaller element on the left
            if (stack.isEmpty()) {
                ansl[i] = -1;
            }
            // Otherwise, the index of the next smaller element is at the top of the stack
            else {
                ansl[i] = stack.peek();
            }
            // Push the current element's index onto the stack
            stack.push(i);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        int ansr[] = new int[arr.length];
        int ansl[] = new int[arr.length];
        int max = 0;
        nextSmallerOnRight(arr, ansr);
        nextSmallerOnLeft(arr, ansl);

        for (int i = 0; i < arr.length; i++) {
            int area = arr[i] * (ansr[i] - ansl[i] - 1);
            if (area > max) {
                max = area;
            }
        }
        System.out.println(max);
    }
}

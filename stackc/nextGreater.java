package stackc;

import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int ans[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        int nextG;
        int curr;
        for (int i = arr.length - 1; i >= 0; i--) {
            curr = arr[i];
            while (s.empty() != true && arr[s.peek()] <= curr) {

                s.pop();

            }
            if (s.empty() == true) {
                ans[i] = -1;
            } else {
                nextG = s.peek();
                ans[i] = arr[nextG];
            }
            s.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

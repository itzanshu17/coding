package stackc;

import java.util.Stack;

public class usingJCF {
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        System.out.println(S.peek());
        S.pop();
    }
}

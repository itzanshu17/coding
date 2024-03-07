package stackc;

import java.util.Stack;

public class duplicatePara {
    public static void main(String[] args) {
        String str = "((a)+(b))";
        Stack<Character> s = new Stack<>();
        char curr;
        boolean ans = false;
        for (int i = 0; i < str.length(); i++) {
            curr = str.charAt(i);
            if (curr != ')') {
                s.push(curr);
            } else {
                int count = 0;
                while (s.isEmpty() == false && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    ans = true;
                    break;
                } else {
                    s.pop();
                }
            }
        }
        System.out.println(ans);
    }
}

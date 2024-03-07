package stackc;

import java.util.Stack;

public class validParenthese {
    public static void main(String[] args) {
        String str = "{({[]}())}";
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '{' || curr == '[' || curr == '(') {
                s.push(curr);
            } else {
                if (s.isEmpty() == true) {
                    break;
                } else if (s.peek() == '(' && curr == ')') {
                    s.pop();
                } else if (s.peek() == '{' && curr == '}') {
                    s.pop();
                } else if (s.peek() == '[' && curr == ']') {
                    s.pop();
                } else {
                    break;
                }
            }
        }
        if (s.isEmpty() == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

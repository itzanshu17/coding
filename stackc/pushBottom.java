package stackc;

import java.util.Stack;

public class pushBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        pushAtBottom(s, 1);
        System.out.println(s);

        reversestack(s);
        System.out.println(s);

        String str = "Teri maa ki jai";
        reverseString(str);
    }

    // reverse a stack 1234 -->4321
    private static void reversestack(Stack<Integer> s) {
        if (s.size() == 0) {
            return;
        }
        int temp = s.pop();
        reversestack(s);
        pushAtBottom(s, temp);
    }

    // reverse a string abc --> cba
    private static void reverseString(String str) {
        Stack<Character> c = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            c.push(ch);
        }
        StringBuilder result = new StringBuilder("");
        int n = c.size();
        for (int i = 0; i < n; i++) {
            char curr = c.pop();
            result.append(curr);
        }
        System.out.println(result);
    }

    // push at bottom 234--> 1234
    private static void pushAtBottom(Stack<Integer> s, int i) {
        if (s.size() == 0) {
            s.push(i);
            return;
        }
        int temp = s.pop();
        pushAtBottom(s, i);
        s.push(temp);
    }
}

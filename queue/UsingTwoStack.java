package queue;

import java.util.Stack;

public class UsingTwoStack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            if (s1.isEmpty() == true) {
                return true;
            }
            return false;
        }

        public static void push(int n) {
            if (s1.isEmpty() == true) {
                s1.push(n);
            } else {
                while (s1.isEmpty() != true) {
                    s2.push(s1.pop());
                }
                s1.push(n);
                while (s2.isEmpty() != true) {
                    s1.push(s2.pop());
                }
            }
        }

        public static int pop() {
            int top = s1.pop();
            return top;
        }

        public static int peek() {
            int top = s1.peek();
            return top;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        while (q.isEmpty() != true) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}

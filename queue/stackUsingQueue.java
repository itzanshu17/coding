package queue;

import java.util.*;

public class stackUsingQueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            if (q1.isEmpty() == true) {
                return true;
            }
            return false;
        }

        public static void add(int n) {
            if (q1.isEmpty() == true) {
                q1.add(n);
                return;
            }
            while (q1.isEmpty() != true) {
                q2.add(q1.remove());
            }
            q1.add(n);
            while (q2.isEmpty() != true) {
                q1.add(q2.remove());
            }
        }

        public static int remove() {
            int top = q1.remove();
            return top;
        }

        public static int peek() {
            int top = q1.peek();
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        while (s.isEmpty() != true) {
            System.out.println(s.peek());
            s.remove();
        }
    }
}

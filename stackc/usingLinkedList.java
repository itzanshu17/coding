package stackc;

import java.util.LinkedList;

public class usingLinkedList {
    static class Stack {
        static LinkedList<Integer> list = new LinkedList<>();

        // is empty
        public static boolean isempty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.addFirst(data);
        }

        // pop
        public static int pop() {
            if (isempty() == true) {
                return -1;
            }
            int top = list.element();
            list.removeFirst();
            return top;
        }

        // peek
        public static int peek() {
            if (isempty() == true) {
                return -1;
            }
            int top = list.element();
            return top;
        }
    }

    public static void main(String[] args) {
        Stack l = new Stack();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);

        while (l.isempty() == false) {
            System.out.println(l.peek());
            System.out.println(l.pop());
        }
    }
}

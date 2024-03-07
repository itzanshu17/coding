package stackc;

import java.util.ArrayList;

public class usingarraylist {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // is empty
        public static boolean isempty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (list.size() == 0) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (list.size() == 0) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }

    }

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (s.isempty() == false) {
            System.out.println(s.peek());
            System.out.println(s.pop());
        }

    }
}

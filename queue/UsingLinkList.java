package queue;

public class UsingLinkList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            if (head == null && tail == null) {
                return true;
            }
            return false;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            return;
        }

        public static int remove() {
            int top = head.data;
            if (isEmpty() == true) {
                return -1;
            } else if (tail == head) {
                tail = head = null;
                return top;
            }
            head = head.next;
            return top;
        }

        public static int peek() {
            int top;
            if (isEmpty() == true) {
                return -1;
            }
            top = head.data;
            return top;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (q.isEmpty() != true) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

package queue;

public class UsingArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void Enque(int data) {
            if (rear == size - 1) {
                System.out.println("Queue bhar gai hai bhai ");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        public static int dequeue() {
            int top;
            if (isEmpty() == true) {
                System.out.println("khali hai bhai ");
                return -1;
            }
            top = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return top;
        }

        public static int peek() {
            if (isEmpty() == true) {
                System.out.println("khali hai bhai ");
                return -1;
            }
            int top = arr[0];
            return top;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Enque(1);
        q.Enque(2);
        q.Enque(3);
        q.Enque(4);

        while (q.isEmpty() != true) {
            System.out.print(q.peek());
            q.dequeue();
        }
    }
}

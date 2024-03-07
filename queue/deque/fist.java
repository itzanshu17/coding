package queue.deque;

import java.util.Deque;
import java.util.LinkedList;

public class fist {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(5);
        dq.addLast(3);
        System.out.println(dq);
    }
}

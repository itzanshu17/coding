package queue;

import java.util.*;

public class interleave {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q1.add(i);
        }
        int size = q1.size();

        for (int i = 0; i < size / 2; i++) {
            q2.add(q1.remove());
        }

        for (int i = 0; i < size / 2; i++) {
            int e = q2.peek();
            q2.remove();
            q1.add(e);
            int top = q1.remove();
            q1.add(top);
        }
        System.out.println(q1);

    }
}

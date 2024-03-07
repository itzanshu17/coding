package queue;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        while (q.isEmpty() != true) {
            int e = q.remove();
            s.push(e);
        }

        while (s.isEmpty() != true) {
            int el = s.pop();
            q.add(el);
        }
        System.out.println(q);
    }
}

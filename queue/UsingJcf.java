package queue;

import java.util.*;

public class UsingJcf {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        // System.out.print(q + " ");
        // System.out.println();
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

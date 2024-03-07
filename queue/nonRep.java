package queue;

import java.util.*;

public class nonRep {
    public static void main(String[] args) {
        String str = "aabccxb";
        int farr[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            q.add(curr);
            farr[curr - 'a']++;
            while (q.isEmpty() != true && farr[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty() == true) {
                System.out.println("-1");
            } else {
                System.out.println(q.peek());
            }
        }
    }
}

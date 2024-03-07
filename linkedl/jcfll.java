package linkedl;

import java.util.*;

import linkedl.first.Node;

public class jcfll {
    public static void main(String[] args) {
        LinkedList<Integer> nl = new LinkedList<>();

        nl.addLast(1);
        nl.addFirst(0);
        nl.addLast(2);
        nl.addFirst(5);
        nl.addLast(9);
        nl.addFirst(8);
        nl.addLast(4);
        nl.addFirst(7);
        System.out.println(nl);
        System.out.println(nl.size());

        // nl.removeLast();
        System.out.println(mid());

    }

    public static Node mid() {
        return null;
    }
}

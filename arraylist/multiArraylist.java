package arraylist;

import java.util.ArrayList;

public class multiArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        // add
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        ArrayList<Integer> l2 = new ArrayList<>();

        // add
        l2.add(2);
        l2.add(4);
        l2.add(8);
        l2.add(16);
        l2.add(32);
        ArrayList<Integer> l3 = new ArrayList<>();

        // add
        l3.add(3);
        l3.add(6);
        l3.add(9);
        l3.add(12);
        l3.add(15);

        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        main.add(l1);
        main.add(l2);
        main.add(l3);

        System.out.println(main);

    }
}

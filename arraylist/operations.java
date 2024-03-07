package arraylist;

import java.util.*;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // get
        int element = list.get(2);
        System.out.println(element);

        // remove
        list.remove(2);
        System.out.println(list);

        // set
        list.set(2, 10);
        System.out.println(list);

        // containe
        System.out.println(list.contains(11));
        System.out.println(list.contains(1));

        // add another
        list.add(2, 99);
        System.out.println(list);

        System.out.println(list.size());

        // print reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        // find max
        int max = 0;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println();
        System.out.println(max);

        // swap
        // index 1 and 3
        int temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);
        System.out.println(list);

        // sort
        Collections.sort(list);
        System.out.println(list);
    }
}
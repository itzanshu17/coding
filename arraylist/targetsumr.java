package arraylist;

import java.util.ArrayList;

public class targetsumr {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        tsum(list, target);

    }

    private static void tsum(ArrayList<Integer> list, int target) {
        int i = 0;
        int j = 0;
        int n = list.size();

        for (int k = 0; k < list.size(); k++) {
            if (list.get(0) > list.get(k)) {
                i = k;
                j = k - 1;
                return;
            }
        }
        while (list.get(i) != list.get(j)) {
            if (list.get(i) + list.get(j) == target) {
                System.out.println(i + " " + j);
                return;
            } else if (list.get(i) + list.get(j) < target) {
                i = (i + 1) % n;
            } else {
                j = (n + j - 1) % n;
            }
        }
    }

}

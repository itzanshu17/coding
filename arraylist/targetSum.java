package arraylist;

import java.util.ArrayList;

public class targetSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        tsum(list, target);

    }

    private static void tsum(ArrayList<Integer> list, int target) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (list.get(i) + list.get(j) == target) {
                System.out.println(i + " " + j);
                return;
            } else if (list.get(i) + list.get(j) < target) {
                i++;
            } else {
                j--;
            }
        }
    }

    // private static void tsum(ArrayList<Integer> list, int t) {
    // for (int i = 0; i < list.size() - 1; i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (t == list.get(i) + list.get(j)) {
    // System.out.println(i + " " + j);
    // }
    // }
    // }
    // return;
    // }
}

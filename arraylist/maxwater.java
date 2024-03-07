package arraylist;

import java.util.ArrayList;

public class maxwater {
    public static void main(String[] args) {
        ArrayList<Integer> heigh = new ArrayList<>();
        heigh.add(1);
        heigh.add(8);
        heigh.add(6);
        heigh.add(2);
        heigh.add(5);
        heigh.add(4);
        heigh.add(8);
        heigh.add(3);
        heigh.add(7);

        int ans = maxwater(heigh);
        System.out.println(ans);
    }

    private static int maxwater(ArrayList<Integer> heigh) {
        int max = 0;
        int h = 0;
        int w = 0;
        int s = 0;
        int e = heigh.size() - 1;
        while (e > s) {
            h = Math.min(heigh.get(e), heigh.get(s));
            w = e - s;
            max = Math.max(max, (h * w));
            if (h == heigh.get(e)) {
                e--;
            } else {
                s++;
            }
        }
        return max;
    }

    // private static int maxwater(ArrayList<Integer> heigh) {
    // int max = 0;
    // int h = 0;
    // int w = 0;
    // for (int i = 0; i < heigh.size() - 1; i++) {
    // for (int j = i + 1; j < heigh.size(); j++) {
    // h = Math.min(heigh.get(i), heigh.get(j));
    // w = j - i;
    // max = Math.max(max, (h * w));
    // }
    // }

    // return max;
    // }
}

package recursion;

public class binarystring {
    public static void main(String[] args) {
        noconsecutiveOne(3, 0, "");
    }

    private static void noconsecutiveOne(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if (lastplace == 0) {
            noconsecutiveOne(n - 1, 0, str + "0");
            noconsecutiveOne(n - 1, 1, str + "1");
        } else {
            noconsecutiveOne(n - 1, 0, str + "0");
        }
    }
}

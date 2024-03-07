package recursion;

public class pairing {
    public static void main(String[] args) {
        System.out.println(friendspairing(3));
    }

    private static int friendspairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendspairing(n - 1) + (n - 1) * friendspairing(n - 2);
    }
}

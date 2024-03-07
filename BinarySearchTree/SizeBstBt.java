package BinarySearchTree;

public class SizeBstBt {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class info {
        boolean isbst;
        int size;
        int min;
        int max;

        public info(boolean isbst, int size, int min, int max) {
            this.isbst = isbst;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        sizeBst(root);
        System.out.println(maxBst);

    }

    public static int maxBst = 0;

    public static info sizeBst(Node root) {
        if (root == null) {
            return new info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        info leftI = sizeBst(root.left);
        info rightI = sizeBst(root.right);

        int size = leftI.size + rightI.size + 1;
        int min = Math.min(leftI.min, Math.min(rightI.min, root.data));
        int max = Math.max(leftI.max, Math.max(rightI.max, root.data));
        if (root.data < leftI.max || root.data > rightI.min) {
            return new info((false), size, min, max);
        }

        if (leftI.isbst && rightI.isbst) {
            maxBst = Math.max(maxBst, size);
            return new info(true, size, min, max);
        }
        return new info(false, size, min, max);
    }
}

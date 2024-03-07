package BinarySearchTree;

public class validBst {
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

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println(valid(root, min, max));
        Node min2 = null;
        Node max2 = null;
        System.out.println(valid2(root, min2, max2));
    }

    // through node
    private static boolean valid2(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        } else {
            boolean cl = valid2(root.left, min, root);
            boolean cr = valid2(root.right, root, max);
            if (cl == true && cr == true) {
                return true;
            } else {
                return false;
            }
        }
    }

    // through value
    private static boolean valid(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (min < root.data && root.data < max) {
            boolean cl = valid(root.left, min, root.data);
            boolean cr = valid(root.right, root.data, max);

            if (cl == true && cr == true) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
}

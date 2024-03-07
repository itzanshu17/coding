package BinarySearchTree;

public class avlTree {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preOrder(root);
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;
        }

        // update height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // get balance factor
        int bf = getbalance(root);

        // check for cases

        // left left case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // right right case
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // left right case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // right left case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root; // if balanced
    }

    private static Node leftRotate(Node x) {

        /*
         * x
         * \
         * y
         * /
         * t2
         */
        Node y = x.right;
        Node t2 = y.left;

        // perform rotation
        y.left = x;
        x.right = t2;

        // update height
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    private static Node rightRotate(Node y) {
        /*
         * y
         * /
         * x
         * \
         * t2
         */
        Node x = y.left;
        Node t2 = x.right;

        // perform
        x.right = y;
        y.left = t2;

        // update height
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return x;
    }

    private static int getbalance(Node root) {
        if (root == null) {
            return 0;
        }

        // become +ve when left case
        // become -ve when right case
        return height(root.left) - height(root.right);
    }
}

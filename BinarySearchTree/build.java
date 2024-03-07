package BinarySearchTree;

public class build {
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
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        System.out.println(searchBst(root, 6));
        inorder(root);
        dletenODE(root, 3);
        System.out.println();
        System.out.println("after delete");
        inorder(root);
    }

    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    private static Node dletenODE(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (root.data < key) {
            root.right = dletenODE(root.right, key);
        } else if (root.data > key) {
            root.left = dletenODE(root.left, key);
        } else {
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            else if (root.left == null || root.right == null) {
                if (root.left == null) {
                    return root.right;
                } else {
                    return root.left;
                }
            }
            // case 3
            else {
                Node succ = findSuccesor(root.right);
                root.data = succ.data;
                root.right = dletenODE(root.right, succ.data);

            }
        }
        return root;
    }

    private static Node findSuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    private static boolean searchBst(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return searchBst(root.left, key);
        } else {
            return searchBst(root.right, key);
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

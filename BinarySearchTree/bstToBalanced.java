package BinarySearchTree;

import java.util.ArrayList;

public class bstToBalanced {
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
        // normal bst
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        ArrayList<Integer> inorderArr = new ArrayList<>();
        inorder(inorderArr, root);
        System.out.println(inorderArr);
        int start = 0;
        int end = inorderArr.size() - 1;
        // balanced bst
        Node root2 = createBst(inorderArr, start, end);
        preorder(root2);
    }

    // pre - order
    private static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // in - order
    private static void inorder(ArrayList<Integer> in, Node root) {
        if (root == null) {
            return;
        }
        inorder(in, root.left);
        in.add(root.data);
        inorder(in, root.right);
    }

    // create a bst for sorted array
    private static Node createBst(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));

        root.left = createBst(arr, start, mid - 1);
        root.right = createBst(arr, mid + 1, end);
        return root;
    }
}

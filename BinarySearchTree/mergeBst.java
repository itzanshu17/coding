package BinarySearchTree;

import java.util.*;

public class mergeBst {
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
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        mergeBst(root, root2);
    }

    private static void mergeBst(Node root, Node root2) {
        ArrayList<Integer> inorderArr = new ArrayList<>();
        ArrayList<Integer> inorderArr2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        inorder(inorderArr, root);
        inorder(inorderArr2, root2);
        mergearray(inorderArr, inorderArr2, result);
        int start = 0;
        int end = result.size() - 1;
        System.out.println(createBst(result, start, end).data);

    }

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

    private static ArrayList<Integer> mergearray(ArrayList<Integer> list1, ArrayList<Integer> list2,
            ArrayList<Integer> result) {
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }
        return result;
    }

    private static void inorder(ArrayList<Integer> inorderArr2, Node root2) {
        if (root2 == null) {
            return;
        }
        inorder(inorderArr2, root2.left);
        inorderArr2.add(root2.data);
        inorder(inorderArr2, root2.right);
    }
}
